package com.spring.finalproject3.yeonha;


public class BoardVO {

	private String seq;          // 글번호 
    private String subject;      // 글제목
    private String content;      // 글내용 
    private String files;		 // 파일
    private String categoryno;	 // 카테고리번호(1:자유,2:중고,3:모집)
    private String readCount;    // 글조회수
    private String regDate;      // 글쓴시간
    private String good;		 // 좋아요
    private String fk_hakbun;	 // 학번
    private String name;         // 글쓴이 
    private String status;       // 글삭제여부   1:사용가능한 글,  0:삭제된글
    
    
    private String previousseq;      // 이전글번호
    private String previoussubject;  // 이전글제목
    private String nextseq;          // 다음글번호
    private String nextsubject;      // 다음글제목   
    
    
    // === #81. 댓글형 게시판을 위한 commentCount 필드 추가하기 
    //          먼저 tbl_board 테이블에 commentCount 라는 컬럼이 존재해야 한다. 
    private String commentCount;     // 댓글수 
    
    public String getPreviousseq() {
		return previousseq;
	}

	public void setPreviousseq(String previousseq) {
		this.previousseq = previousseq;
	}

	public String getPrevioussubject() {
		return previoussubject;
	}

	public void setPrevioussubject(String previoussubject) {
		this.previoussubject = previoussubject;
	}

	public String getNextseq() {
		return nextseq;
	}

	public void setNextseq(String nextseq) {
		this.nextseq = nextseq;
	}

	public String getNextsubject() {
		return nextsubject;
	}

	public void setNextsubject(String nextsubject) {
		this.nextsubject = nextsubject;
	}

	public BoardVO(){}    
    
	public BoardVO(String seq, String subject, String content, String files, String categoryno, String readCount,
			String regDate, String good, String fk_hakbun, String name, String status) {
		super();
		this.seq = seq;
		this.subject = subject;
		this.content = content;
		this.files = files;
		this.categoryno = categoryno;
		this.readCount = readCount;
		this.regDate = regDate;
		this.good = good;
		this.fk_hakbun = fk_hakbun;
		this.name = name;
		this.status = status;
	}

	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReadCount() {
		return readCount;
	}
	public void setReadCount(String readCount) {
		this.readCount = readCount;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	public String getFiles() {
		return files;
	}

	public void setFiles(String files) {
		this.files = files;
	}

	public String getCategoryno() {
		return categoryno;
	}

	public void setCategoryno(String categoryno) {
		this.categoryno = categoryno;
	}

	public String getGood() {
		return good;
	}

	public void setGood(String good) {
		this.good = good;
	}

	public String getFk_hakbun() {
		return fk_hakbun;
	}

	public void setFk_hakbun(String fk_hakbun) {
		this.fk_hakbun = fk_hakbun;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(String commentCount) {
		this.commentCount = commentCount;
	}
    
    
}
