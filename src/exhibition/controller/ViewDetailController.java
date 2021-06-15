package exhibition.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import exhibition.service.ExhibitionService;
import exhibition.service.UserService;
import exhibition.vo.Exhibition;
import exhibition.vo.User;

public class ViewDetailController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	HttpSession session = request.getSession();

	int eid = Integer.parseInt((String)request.getParameter("eid"));
	
	ExhibitionService s = ExhibitionService.getInstance();
	ArrayList<Exhibition>list = s.getDetail(eid); 
	
	request.setAttribute("eid", eid);
	request.setAttribute("list", list);
	HttpUtil.forward(request, response, "/exhibitionDetail.jsp");
		
		/*ExhibitionService s = ExhibitionService.getInstance();
		
		int eid = Integer.parseInt((String) request.getSession().getAttribute("eid"));
		
		ArrayList<Exhibition> exhibition = s.getDetail(eid);
		
		request.setAttribute("exhibition", exhibition);
		HttpUtil.forward(request, response, "/exhibitionDetail.jsp");*/
	
	
	}
}
