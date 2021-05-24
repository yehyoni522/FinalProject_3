<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<%
	String ctxPath = request.getContextPath();
    //     /MyMVC 
%>
<style type="text/css">
	div#calendar{
		float: left; 
		width: 42%;
		height:600px;
		padding:10px;
		margin-left: 100px;
	}
	div#logincheck{
		border-left: 1px solid black; 
		float: left; 
		height:600px;
		width: 42%; 
		padding:10px;
		padding-top: 250px;
		
	}
	div#mainBoard{ 
		float: left; 
		margin-left: 120px;
        width: 80%; 
        }
        
     table {
      width: 100%;
     
      }
      table, th, td {
      	text-align:center;
        border: 1px solid #bcbcbc;
		font-size: 12pt;
		padding: 5px 0px 5px 0px;
      }

</style>
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap" rel="stylesheet">
<div style="width: 40px; font-size: 20pt; font-weight: bold; cursor:pointer;">
	<img src="<%= ctxPath%>/resources/images/addmenu.png" style="width:100%;">
</div>

<div id="calendar" align="center">
	캘린더 자리
</div>


<div id="logincheck" align="center" >
	<span style="font-size: 20pt; font-weight: bold;">로그인을 해주세요.</span>
</div>

<div id="mainBoard" align="center">
		<h2 style="padding-top:50px;">게시판</h2>
		<h3>실시간 인기글</h3>
	    <table>
	        <thead>
	           <tr id="menu">	 
	              <th>No.</th>
	              <th>분류</th>
	              <th>제목</th>
	              <th>작성자</th>
	              <th>추천수</th>
	           </tr>
	        </thead>
	    </table>

</div>

