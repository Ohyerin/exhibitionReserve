package exhibition.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exhibition.controller.HttpUtil;

import exhibition.service.UserService;
import exhibition.vo.User;

public class ViewMineController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserService s = UserService.getInstance();
		
		String id = (String)request.getSession().getAttribute("id");
		
		User user = s.viewMine(id);
		
		request.setAttribute("user", user);
		HttpUtil.forward(request, response, "/result/mypage.jsp");
	}

}
