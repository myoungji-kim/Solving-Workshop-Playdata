<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	today = new Date();
	today = today.toISOString().slice(0, 10);
	document.getElementById("date").value = today;
	
	var httpRequest;
	function req(){
		if (event.keyCode != 8){
			event.preventDefault();
			httpRequest = new XMLHttpRequest();
			
			// 요청 시 응답 처리하는 함수
			httpRequest.onreadystatechange = responseFun;
			
			var no = document.querySelector("#empno").value;
			httpRequest.open("get", "loginCheck.jsp?no="+no, true);
			httpRequest.send(null); // get 방식일 경우
		}
	}
	
	function responseFun(){
		console.log(httpRequest.readyState);
		console.log(httpRequest.status);
		if (httpRequest.readyState==4 && httpRequest.status == 200){
			var data = httpRequest.responseText;
			document.querySelector('#result').innerHTML = data;
		}
	}
</script>
</head>
<body>
<form action="add.jsp" method="get"> <!-- 원래는 post가 맞음 -->
<h3>[사원 등록]</h3>
<div style="color:red"> emp 테이블에 누락된 컬럼은 모두 null 또는 0으으로 저장</div>
<input type="hidden" name="deptno" value="0">
<table border="1">
	<tr>
		<th>사원번호</th>
		<td><input type="text" name="empno" id="empno" onkeyup="req()">
			<span id="result" style="color:red"></span>
		</td>
	</tr>
	<tr>
		<th>사원이름</th>
		<td><input type="text" name="ename" id="ename"></td>
	</tr>
	<tr>
		<th>직업</th>
		<td>
			<select name="job" id="job">
				<option value="CLERK"> CLERK </option>
				<option value="MANAGER"> MANAGER </option>
				<option value="ANALYST"> ANALYST </option>
			</select>
		</td>
	</tr>
	<tr>
		<th>관리자</th>
		<td><input type="text" name="mgr" id="mgr" value="7926">실습을 위해 7962으로 고정</td>
	</tr>
	<tr>
		<th>입사일</th>
		<td>현재 날짜로 자동 저장 <input type="date" name="hiredate" id="date"></td>
	</tr>
	<tr>
		<th>월급</th>
		<td><input type="text" name="sal" id="sal" value="1500">실습을 위해 1500으로 고정</td>
	</tr>
	<tr>
		<td colspan="2" style="text-align:center">
			<input type="submit" value="사원등록">
			<input type="button" value="다시 입력">
		</td>
	</tr>
</table>
<a href="list.jsp">목록보기</a>
</form>
</body>
</html>