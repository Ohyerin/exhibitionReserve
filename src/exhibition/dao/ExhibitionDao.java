  package exhibition.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import exhibition.vo.Exhibition;
import exhibition.vo.User;


public class ExhibitionDao {

	private static ExhibitionDao dao = new ExhibitionDao();
	private ExhibitionDao() {}
	public static ExhibitionDao getInstance() {
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
	
	public ArrayList<Exhibition> list() {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Exhibition exhibition= null;
		
		ArrayList<Exhibition> list = new ArrayList<Exhibition>(); // 타입 지정
		
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select title, img, period, place, theme from exhibition order BY case\r\n"
					+ "	when theme='여행' then 1\r\n"
					+ "	when theme='예술' then 2\r\n"
					+ "	when theme='자연' then 3\r\n"
					+ "	when theme='과학' then 4\r\n"
					+ "	when theme='가족' then 5\r\n"
					+ "	when theme='일상' then 6\r\n"
					+ "end;");
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				exhibition = new Exhibition();
				exhibition.setTitle(rs.getString(1));
				exhibition.setImg(rs.getString(2));
				exhibition.setPeriod(rs.getString(3));
				exhibition.setPlace(rs.getString(4));
				exhibition.setTheme(rs.getString(5));
				list.add(exhibition);
			}
			
			System.out.println(list);
		}catch(Exception e)
		{
			System.out.println("MSearch error"+e);
		}finally
		{
			close(conn,pstmt,rs);
		}
		return list;
	
	}
	public ArrayList<Exhibition> getDetail(int eid) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<Exhibition> list = new ArrayList<Exhibition>();
		Exhibition exhibition = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select eid, title, period from exhibition where eid =?;");
			pstmt.setInt(1, eid);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				exhibition = new Exhibition();
				exhibition.setId(rs.getInt(1));
				exhibition.setTitle(rs.getString(2));
				exhibition.setPeriod(rs.getString(3));
				list.add(exhibition);
			}
		}catch(Exception e)
		{
			System.out.println("MSearch error"+e);
		}finally
		{
			close(conn,pstmt,rs);
		}
		return list;	
	
	}


	
	
}

