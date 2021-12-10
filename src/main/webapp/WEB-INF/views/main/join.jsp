<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
	<link rel="stylesheet" href="${path}/resources/css/reset.css">
	<link rel="stylesheet" href="${path}/resources/css/join.css">

</head>
<body>

<div id="wrap">
	
		<form action="./joinAction" method="POST" id="join">
            <!-- 로고 -->
			<h1>
				<a href="form.html"><img src="${path}/resources/images/logo.svg" alt=""></a>
			</h1>
            <!-- 아이디 입력창 -->
            <div id="id_box">
			    <input type="text" name="user_id" id="user_id" placeholder="아이디를 입력하세요" required>
            </div>
            <button type="submit" id="id_btn">중복확인</button>
            <!-- 비밀번호 입력창 -->
			<input type="password" name="user_pw" id="user_pw" placeholder="비밀번호를 입력하세요" required>
            <input type="password" name="user_pw2" id="user_pw2" placeholder="비밀번호 확인" required>
            <div id="pass_ch">
                <h6>비밀번호가 서로 다릅니다.</h6>
                <h6>확인되었습니다.</h6>
            </div>
            <!-- 이름 입력창 -->
            <div id="name">
                <input type="text" name="user_name" id="user_name" placeholder="이름을 입력하세요" required>
            </div>
            <!-- 성별 -->
            <div class="gender">
                <input type="radio" id="gender_m" name="user_gender" value="m">
                <label for="gender_m">남자</label>
                <input type="radio" id="gender_w" name="user_gender" value="w">
                <label for="gender_w">여자</label>
            </div>
            <!-- 이메일 입력창 -->
            <div id="email">
                <input type="email" name="user_email" id="user_email" placeholder="이메일을 입력하세요"required>
            </div>
            <button type="submit" id="email_btn">인증</button>
            <!-- 전화번호 입력창 -->
            <div id="tel">
                <input type="text" name="user_tel" id="user_tel" placeholder="전화번호를 입력하세요"required>
            </div>
            <button type="submit" id="tel_btn">인증</button>
            <!-- 가입버튼 -->
			<button type="submit" id="join_btn">회원가입</button>
		</form>
	
	

</div>

</body>
</html>