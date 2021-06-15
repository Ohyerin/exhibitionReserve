<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join</title>
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
<link rel="stylesheet" href="css/join.css">
<link rel="stylesheet" href="css/footer.css">
</head>
<body>
<div id="contents_wrap">
	<div class="contents">
		<div class="containerjoin">
			<h2>회원가입</h2>
			<div class="txtjoin">
				<h3>JOIN</h3>
				<p>회원가입을 진심으로 환영합니다.</p>
			</div>
			<div class="joinbox">
			<form action="join.do">
		    <fieldset>
		      <legend>회원정보입력</legend>
		      <p>*빨간색 빈칸은 필수 입력 정보입니다.</p>
		      <ul>
		        <li>
		          <input type="text" name="email"  placeholder="이메일" required autofocus>
		        </li>
		        <li>
		          <input type="text" name="name"  placeholder="이름" required>
		        </li>
		        <li>
		          <input type="text" name="id"  placeholder="아이디" required>
		        </li>
		        <li>
		          <input type="password" name="pwd"  placeholder="비밀번호" required>
		          <p>비밀번호는 4자리 이상이여야 하며, 영문과 숫자를 반드시 포함해야 합니다.</p>
		        </li>
		        <li>
		          <input type="password" name="pwd2"  placeholder="비밀번호 확인" required>
		        </li> 
		      </ul>
		    </fieldset>
		    <fieldset>
		      <button type="submit"> 등록 </button> 
		    </fieldset>
 		 </form>
			
			
			</div>
			</div>
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