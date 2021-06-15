package exhibition.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import exhibition.service.UserService;
import exhibition.vo.User;

public class LoginController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		UserService s = UserService.getInstance();
		boolean result = s.login(id, pwd);
		String path = null;
		if(result) //로그인 성공
		{
			HttpSession session = request.getSession();
			session.setAttribute("id", id); //이 사람 id가지고 menu 들어가야함. 상태정보유지.
			path = "/userMain.jsp";
		}
		else
		{
			path = "/index.jsp";
		}
		HttpUtil.forward(request, response, path);
	}

}
