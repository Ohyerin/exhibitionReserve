package exhibition.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



import exhibition.vo.User;

public class UserDao {
	private static UserDao dao = new UserDao();
	private UserDao() {}
	public static UserDao getInstance() {
		return dao;
	}
	public Connection connect() 
	{
		Connection conn = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reexhibition","root","hyerin453");
		}catch(Exception e)
		{
			System.out.println("MDAO:connect"+e);
		}
		return conn;
	}
	public void close(Connection conn, PreparedStatement pstmt)
	{
		if(pstmt != null)
		{
			try {
				pstmt.close();
			}catch(Exception e)
			{
				System.out.print("PreparedStatement close error"+e);
			}
		}
		if(conn != null)
		{
			try {
				conn.close();
			}catch(Exception e)
			{
				System.out.print("Conn close error"+e);
			}
		}
	}
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs)
	{
		if(rs != null)
		{
			try {
				rs.close();
			}catch(Exception e)
			{
				System.out.print("rs close error"+e);
			}
		}
		close(conn,pstmt); //앞에 있는 close함수 호출
	}
	
	public boolean login(String id, String pwd) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; //select들어간건 resultset있어야함.
		try 
		{
			conn = connect();
			pstmt = conn.prepareStatement("select * from user where id =? and passwd =?;");
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				result = true;
			}
			else
			{
				result = false;
			}
			
		}catch(Exception e)
		{
			System.out.print("login error"+e);
		}
		finally
		{
			close(conn,pstmt,rs);
		}
		return result;
	}
	public void join(User user) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		try 
		{
			conn = connect();
			pstmt = conn.prepareStatement("insert into user values(?,?,?,?);");
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPwd());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getName());
			pstmt.executeUpdate();
			
		}catch(Exception e)
		{
			System.out.print("join error"+e);
		}
		finally
		{
			close(conn,pstmt);
		}
	}
	public User viewMine(String id) {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = null;
		
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select * from user where id =?;");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				user = new User();
				user.setId(rs.getString(1));
				user.setName(rs.getString(2));
				user.setEmail(rs.getString(3));
			}
		}catch(Exception e)
		{
			System.out.println("MSearch error"+e);
		}finally
		{
			close(conn,pstmt,rs);
		}
		return user;
	
	}
	
}
