<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<%
	String ctxPath = request.getContextPath();
    //     /MyMVC 
%>

<style type="text/css">

/* div#adminside {
	border: 1px red solid;	
	height: 1200px;
	display: flex;
	align-items: center;
}

div#adminmenu{
	border: 1px red solid;
	width: 100%;
	font-size: 15pt;
} */
div#adminside {
	border: 1px red solid;	
	height: 1200px;	
}

div.adminmenu {
	position: fixed;
}

div#adminmenu{
	border: 1px red solid;
	font-size: 10pt;
}



</style>

<script>

	$(function(){
		
		document.addEventListener('scroll', function() {
			
			if(window.pageYOffset >= 840){
				$("div#adminmenu").removeClass("adminmenu");
			}
			else {
				$("div#adminmenu").addClass("adminmenu");
			}
			
		});		
		
	}); // end of $(function(){})

// console.log(window.pageYOffset)
</script>
	
	<div id="adminside" >
 		<div id="adminmenu" class="adminmenu"> 
			<span>관지라 페이지 홈</span>
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
	</div>
