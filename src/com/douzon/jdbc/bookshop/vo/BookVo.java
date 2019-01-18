package com.douzon.jdbc.bookshop.vo;

public class BookVo {
	//쿼리결과 화면출력에 신경쓴다
	private long no;
	private String title;
	private String status;
	private long authorNo;
	private String AuthorName;
	
	
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getAuthorNo() {
		return authorNo;
	}
	public void setAuthorNo(long authorNo) {
		this.authorNo = authorNo;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	@Override
	public String toString() {
		return "도서목록 [책번호="+ no +"], 책이름=" + title + ", 대여유무=" + status + "]";
	}
	
	
}
