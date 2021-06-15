<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="exhibition.vo.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Page</title>
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
<link rel="stylesheet" href="css/mypage.css">
<link rel="stylesheet" href="css/footer.css">
</head>
<body>

<div id="contents_wrap">
	<div class="contents">
		<div class="containermine">
			<h2>마이페이지</h2>
			</div>
			<div class="contentsBox">
				<div class="checkInformation">
					<h1>내 정보 확인</h1>
					<table>
						<tr>
							<td>아이디 :</td>
							<td>${user.id}</td>
						</tr>
						<tr>
							<td>이름    :  </td>
							<td>${user.name}</td>
						</tr>
						<tr>
							<td>이메일 :</td>
							<td>${user.email}</td><br>
						</tr>
					</table>
                </div>
                  <div class="checkReservation">
                  <br><h1>예약 확인</h1>
                  </div>
                                        
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