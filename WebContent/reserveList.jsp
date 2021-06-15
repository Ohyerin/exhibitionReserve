<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="exhibition.vo.Exhibition" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exhibition reserve</title>
<style>
 @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@500&display=swap');
 @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100&display=swap');
	body {
			background-image:url('img/mainImage.jpg');
			background-repeat:no-repeat;
			background-attachment:fixed;
			background-size:cover;
			}
	input[type="radio"] {display:none; }
	input[type="radio"] + label {display:incline-block; padding:10px 80px;
	background:rgba(255,255,255,0); color:#aaa; font-size:14px; cursor:pointer;
	border-radius: 8px;}
	input[type="radio"]:checked + label {background:rgba(255,255,255,0.6); color:black; }
	
	.conbox {float:left; width:1160px; background:rgba(255,255,255,0.6); margin:0 auto; 
	display:none; border-radius: 8px;}
	.exhibitionBox{ float:left; padding:30px; padding-top:50px;width:200px;}
	.exhibitionImg {text-align:center;}
	.exhibitionCon {text-align:center; font-size:14px;}
	.exhibitionCon >p {padding-top:15px; font-size:18px; font-family: 'Noto Sans KR';}
	
	input[id="여행"]:checked ~ .con1 {display:block;}
	input[id="예술"]:checked ~ .con2 {display:block;}
	input[id="자연"]:checked ~ .con3 {display:block;}
	input[id="과학"]:checked ~ .con4 {display:block;}
	input[id="가족"]:checked ~ .con5 {display:block;}
	input[id="일상"]:checked ~ .con6 {display:block;}
</style>
<link rel="stylesheet" href="css/reserveList.css">
<link rel="stylesheet" href="css/footer.css">
</head>
<body>

<div id="contents_wrap">
	<div class="reserve">
			<h2>예약하기</h2>
		<div class="tabContent">
			<input type="radio" name="tabmenu" id="여행" checked>
			<label for="여행">여행</label>
			<input type="radio" name="tabmenu"  id="예술">
			<label for="예술">예술</label>
			<input type="radio" name="tabmenu"  id="자연">
			<label for="자연">자연</label>
			<input type="radio" name="tabmenu"  id="과학">
			<label for="과학">과학</label>
			<input type="radio" name="tabmenu"  id="가족">
			<label for="가족">가족</label>
			<input type="radio" name="tabmenu"  id="일상">
			<label for="일상">일상</label>			
			


<%
			ArrayList<Exhibition> list = (ArrayList<Exhibition>) request.getAttribute("exhibitions");
					
			String preTheme = "";
			int preThemeIndex = 1;
					
			for(int a = 0; a<list.size(); a++)
			{
				//맨 처음만 실행
				if (preTheme == "") {
					preTheme = list.get(a).getTheme();
					%>
				 
					<div class="conbox con<%=preThemeIndex%>">
					
					<%
				}
			
				if (!preTheme.equals(list.get(a).getTheme())) {
					preThemeIndex++;
					%>
					</div>
					<div class="conbox con<%=preThemeIndex%>">
					
					<%
					
				}
						%>
				
						<div class ="exhibitionBox">
							<div class = "exhibitionImg">
							<img src="<%=list.get(a).getImg() %>" width="130" height="180"><br>
							</div>
								<div class="exhibitionCon">
								<p><%=list.get(a).getTitle() %></p><br>
									<%=list.get(a).getPeriod() %><br>
									<%=list.get(a).getPlace() %><br>
									
									<br><a href="/exhibitionDetail.jsp">상세보기</a>
								</div>
							</div>
						<% 
						
				preTheme = list.get(a).getTheme();
						
		} 	 %>
			</div>
		
			
			<!-- div class="conbox con2">미술내용</div>
			<div class="conbox con3">자연내용</div>
			<div class="conbox con4">가족내용</div>
			<div class="conbox con5">동물내용</div>
			<div class="conbox con6">기타내용</div-->
			
			
			
		</div>
	</div>
</div>
<div class="footer">
				<div class="copyrights_area">
						<span>서울특별시 마포구 잔다리로 109</span>
						<span>TEL 041-622-8243</span>
						<span>FAX 041-622-8243</span>
						<br>
						<span>
						대표자 : 오혜린 / Email : hyerin453@naver.com
						</span>
						<br>
						<span>
						Copyright(c)2021 전시회예약하기(주) ExhibitionReservation Co., Ltd. 
						All Rights Reserved
						</span>
				</div>
			</div>	
</body>
</html>