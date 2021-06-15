package exhibition.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exhibition.controller.HttpUtil;
import exhibition.service.UserService;
import exhibition.vo.User;

public class JoinController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String name = request.getParameter("name");
		User user = new User(id,pwd,email,name); //id,password를 넣어주는 생성자 만들기
		UserService s = UserService.getInstance();
		s.join(user);
		
		HttpUtil.forward(request, response, "/index.jsp");
		
	}

}
