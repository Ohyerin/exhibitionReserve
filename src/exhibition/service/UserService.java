package exhibition.service;


import java.util.ArrayList;



import exhibition.dao.UserDao;
import exhibition.vo.User;

public class UserService {
	
	private static UserService service = new UserService();
	private UserService() {}
	private UserDao dao = UserDao.getInstance(); //DB처리하는 객체 dao가져옴.
	public static UserService getInstance()
	{
		return service;
	}
	public boolean login(String id, String pwd) {
		// TODO Auto-generated method stub
		return dao.login(id,pwd);
	}
	public void join(User user) {
		// TODO Auto-generated method stub
		dao.join(user);
	}
	public User viewMine(String id) {
		// TODO Auto-generated method stub
		return dao.viewMine(id);
	}
	
}
