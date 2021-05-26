<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<% request.setCharacterEncoding("UTF-8");%>
<% response.setContentType("text/html; charset=UTF-8");%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<% String ctxPath = request.getContextPath(); %>    

<style type="text/css">
	#addFrm{
		padding-left: 10%;
	}
	input, textarea {
		 border: solid gray 1px; 
	}
  	.long {
  		width: 95%; height: 40px;
  		border: none;
  		border-bottom: 1px solid gray;
  	}
  	.short {width: 120px;}
	.mainline{
		background-color: #e6e6e6;
		height: 3px;
		width: 95%;
	}
	button {
		background-color: white;
		border: solid #e6e6e6 1px;
		width: 54px;
		height: 34px;		
	}
	#btnWrite{
		margin-right: 5px;
	}
	#sub{
		margin-bottom: 1%;
	}
	#userinfo{
		margin-bottom: 1%;
	}
	#noname{
		margin-left: 10px;	
	}
</style>

<script type="text/javascript">
   $(document).ready(function(){
      
      <%-- === #167. 스마트 에디터 구현 시작 === --%>
       
       <%-- === 스마트 에디터 구현 끝 === --%>
      
      // 쓰기버튼
      $("button#btnWrite").click(function(){
      
         <%-- === 스마트 에디터 구현 시작 === --%>
          
         <%-- === 스마트 에디터 구현 끝 === --%>
         
          // 글제목 유효성 검사
         var subjectVal = $("input#subject").val().trim();
         if(subjectVal == "") {
            alert("글제목을 입력하세요!!");
            return;
         }
         
         // 글내용 유효성 검사(스마트에디터 사용 안 할시)
         <%--
         var contentVal = $("textarea#content").val().trim();
         if(contentVal == "") {
            alert("글내용을 입력하세요!!");
            return;
         }
         --%>
         
         <%-- === 스마트에디터 구현 시작 === --%>
         // 스마트에디터 사용시 무의미하게 생기는 p태그 제거
          
              
           
           
           // 스마트에디터 사용시 무의미하게 생기는 p태그 제거하기전에 먼저 유효성 검사를 하도록 한다.
           // 글내용 유효성 검사 
           
           
           // 스마트에디터 사용시 무의미하게 생기는 p태그 제거하기
           
       
          
        
        
       <%-- === 스마트에디터 구현 끝 === --%>
         
         // 글암호 유효성 검사
         var pwVal = $("input#pw").val().trim();
         if(pwVal == "") {
            alert("글암호를 입력하세요!!");
            return;
         }
         
         // 폼(form) 을 전송(submit)
         var frm = document.addFrm;
         frm.method = "POST";
         frm.action = "<%= ctxPath%>/addEnd.action";
         frm.submit();   
      });
           
   });// end of $(document).ready(function(){})----------------
</script>

<div id="addFrm">
	<h1>
 		<c:if test="${requestScope.boardList.categoryno == 1}">자유게시판</c:if>
 		<c:if test="${requestScope.boardList.categoryno == 2}">중고거래</c:if>
 		<c:if test="${requestScope.boardList.categoryno == 2}">동아리&공모전 모집</c:if>
	</h1>
	<h1>자유게시판</h1>
<form> 
 
<hr class="mainline" align="left" >
	<div id="table">
  	 	<div id="sub">                   
			<input type="text" name="subject" id="subject" class="long" placeholder="  제목을 입력하세요."/>  
        </div>
		<div id="userinfo">
	    	작성자 : 컴퓨터공학과&nbsp;채연하&nbsp;12423040
	    	<span id="noname"> <label>익명</label> <input type="checkbox"/> </span>       
	   	</div> 
        <%-- === #150. 파일첨부 타입 추가하기 === --%>
		<div id="con">
		   <textarea rows="10" cols="100" style="width: 95%; height: 612px;" name="content" id="smartEditor" placeholder="  내용을 입력하세요."></textarea>       
		</div>
   
         
       

      </div>
      <hr class="mainline" align="left" >
      <div style="margin-top: 20px;">
         <button type="button" id="btnWrite">등록</button>
         <button type="button" onclick="javascript:history.back()">취소</button>
      </div>
         
   </form>
   
</div>    

<script type="text/javascript">
	var oEditors = [];
	
	nhn.husky.EZCreator.createInIFrame({
		oAppRef : oEditors,
		elPlaceHolder : "smartEditor", //저는 textarea의 id와 똑같이 적어줬습니다.
		sSkinURI : "se2/SmartEditor2Skin.html", //경로를 꼭 맞춰주세요!
		fCreator : "createSEditor2",
		htParams : {
			// 툴바 사용 여부 (true:사용/ false:사용하지 않음)
			bUseToolbar : true,
			
			// 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
			bUseVerticalResizer : false,
			
			// 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
			bUseModeChanger : false
		});
	
	$(function() {
		$("#savebutton").click(function() {
			oEditors.getById["smartEditor"].exec("UPDATE_CONTENTS_FIELD", []);
			//textarea의 id를 적어줍니다.
			
			var selcatd = $("#selcatd > option:selected").val();
			var title = $("#title").val();
			var content = document.getElementById("smartEditor").value;

			if (selcatd == "") {
				alert("카테고리를 선택해주세요.");
				return;
			}
			
			if (title == null || title == "") {
				alert("제목을 입력해주세요.");
				$("#title").focus();
				return;
			}
			
			if(content == "" || content == null || content == ' ' || content == ' ' || content == ' ' || content == ' '){
				alert("본문을 작성해주세요.");
				oEditors.getById["smartEditor"].exec("FOCUS"); //포커싱
				return;
			}
			
			var result = confirm("발행 하시겠습니까?");

			if(result){ 
				alert("발행 완료!"); 
				$("#noticeWriteForm").submit(); 
			}else{ 
				return; 
			}


				
	
			
			
	});
		

</script>