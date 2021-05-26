<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<%
	String ctxPath = request.getContextPath();
    //     /MyMVC 
%>

<style type="text/css">
    
div#adminhome {
	min-height: 700px;
	padding-top: 50px;
	font-family: 'Noto Sans KR', sans-serif;
}

div#adminside {
	border-right:1px solid #b0b0b5;
	float: left;
	width: 20%;
	padding-left: 50px;
	min-height: 700px;
}

div.backadminstudent {

	clear: both;
 	font-size: 13pt;
 	font-weight:bold;	
 	padding-left: 5px;

}

h4 {
	
	border-left:1px solid #b0b0b5;
 	font-weight:bold;	
 	padding-left: 5px;

}


</style>

<script>

</script>

<div id="adminhome">
	
	<div id="adminside" >
		<span style="font-family: 'Noto Sans KR', sans-serif;">관리자 페이지 홈</span>
		<br>
		<br>
		<span>회원/교수진 관리</span>
		<ul>
			<li>학생 관리</li>
			<li>교수진 관리</li>
			<li>활둥중지 회원</li>
		</ul>
		<br>
		<span>게시글 관리</span>
		<ul>
			<li>게시글 관리</li>
			<li>댓글 관리</li>
			<li>스팸글 관리</li>
		</ul>
		<br>
		<span>열람실 관리</span>		
		<br>
		<span>수업 관리</span>	
		<ul>
			<li>수업 개설</li>
		</ul> 	
	</div>
	
	<div id="admincontent">
	
		<div class="backadminstudent">
			<span>학생 관리 목록 돌아가기</span>
		</div>
		
		<h4> 학생 상세 정보 </h4>
		<div>
			<table>
				<tbody>
					<tr>
						<td rowspan="3"></td>
						<td>학번</td>
						<td>소속 및 학년</td>
						<td>연락처</td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</tbody>
			</table>
		</div>
		
		<h4> 수강 내역 </h4>
		<div>
			<select>
				<option>수강학기</option>
			</select>
			<table>
				<thead>
					<tr>
						<th>수강학기</th>
						<th>과목번호</th>
						<th>교과목명</th>
						<th>교수</th>
						<th>총점</th>
					</tr>
				</thead>
			</table>
		</div>
		
		<h4> 작성한 게시글 / 댓글 </h4>
		<div>
		
		</div>
		
		<h4> 열람실 이용 내역 </h4>
		<div>
		
		</div>
						
	</div>

</div>