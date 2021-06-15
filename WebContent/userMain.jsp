<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Main</title>
  <style>
    
	body {
			background-image:url('img/mainImage.jpg');
			background-repeat:no-repeat;
			background-attachment:fixed;
			background-size:cover;
			margin-top:100px;
			margin-bottom:50px;
			}
   
</style>
<link rel="stylesheet" href="css/userMain.css">
<link rel="stylesheet" href="css/footer.css">
</head>

<body>
	<div class="wrap">
		<section class="main">
			<div class="menu">
				<div class="welcome">
				<p><%= session.getAttribute("id") %>님 환영합니다!</p>
				</div>
				<a href="viewMine.do" class="mypage">MYPAGE</a>
				<a href="/result/logoutResult.jsp" class="logout">LOGOUT</a>
			</div>
		 
			<div class="titleBox">
				<h3>전시회<br>예약하기</h3>
			</div>	
			<div class="reserveBox">	
				<a href="reserveList.do" class="btn">GO</a>
			</div>
		</section>
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
