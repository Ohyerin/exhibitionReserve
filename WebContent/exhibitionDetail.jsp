<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="exhibition.service.*" %>
<%@page import="exhibition.vo.Exhibition" %>
<%@page import=  "exhibition.controller.HttpUtil"%>

<%

	int eid = Integer.parseInt(request.getParameter("eid"));

	ExhibitionService s = ExhibitionService.getInstance();	
	
	ArrayList<Exhibition>list = s.getDetail(eid); 
	

	Exhibition exhibition = null;
	for(Exhibition vo : list)
	{
		if(vo.getId()==eid)
		{
			exhibition = vo;
			break;
		}
	}
	
%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@500&display=swap');
 @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100&display=swap');
	body {
			background-image:url('img/mainImage.jpg');
			background-repeat:no-repeat;
			background-attachment:fixed;
			background-size:cover;
			}
</style>

</head>
<body>

<div class="row" style="margin-bottom:20px; margin-left:1px;">
<div class="col-lg-12">
<h1 class="page-header">상세 페이지</h1>
</div>
</div>

<div class="panel" style="margin-left:1px;">
<div id="contAreaBox">
<div class="panel">
<div class="panel-body">
<form role="form" action="/board/create_action" method="post">
<div class="table-responsive" style="text-align:center;">




<table id="datatable-scroller"
	class="table table-bordered tbl_Form">
	<caption></caption>
	<colgroup>
		<col width="250px" />
		<col />
	</colgroup>
	<tbody>
	
	
	<h2><%=exhibition.getTitle() %></h2>
		<tr>
			<th class="active" >기간</th>
			<td>
			<%=exhibition.getPeriod() %>
			</td>
		</tr>
		<tr>
			<th class="active">장소</th>
			<td>
			<%=exhibition.getPlace() %>
			</td>
		</tr>
		<tr>
			<th class="active" >내용</th>
			<td>
			<%=exhibition.getContent() %>
			</td>
		</tr>
	</tbody>
</table>
정보가 없습니다

</div>
<div style="margin-left:1px;">

</div>
</form>
</div>
</div>
</div>
</div>
			
</body>
</html>