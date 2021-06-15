package exhibition.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exhibition.service.ExhibitionService;
import exhibition.vo.Exhibition;

public class ViewListController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Step 1. exhibition 리스트 가져오기
		
		ExhibitionService s = ExhibitionService.getInstance();
		
		ArrayList<Exhibition> exhibitions = s.list();
		
		
		
		// Step 2. view에 exhibition 넘겨주기
		request.setAttribute("exhibitions", exhibitions);
		HttpUtil.forward(request, response, "/reserveList.jsp");
		
	}

}
