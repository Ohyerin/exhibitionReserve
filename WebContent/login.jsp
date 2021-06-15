<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
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
<link rel="stylesheet" href="css/login.css">
<link rel="stylesheet" href="css/footer.css">
</head>
<body>
<div id="contents_wrap">
	<div class="contents">
		<div class="containerlogin">
			<h2>로그인</h2>
			<div class="txtlogin">
				<h3>LOGIN</h3>
				<p>로그인을 하셔야 이용이 가능합니다.</p>
			</div>
			<div class="loginbox">
				<form action="login.do">
				<fieldset>
				<ul>
					<li>
						<label for="userid">아이디</label>
						<input type="text" name="id" autofocus required>
					</li>
					<li>
						<label for="userpwd">비밀번호</label>
						<input type="password" name="pwd" required>
					</li>
				</ul>
				</fieldset>
				<fieldset>
					<button type="submit">로그인</button>
				</fieldset>
				</form>
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
</body>
</html>
