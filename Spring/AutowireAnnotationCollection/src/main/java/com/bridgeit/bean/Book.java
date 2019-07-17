package com.bridgeit.bean;

public class Book {
	private int bookId;
	private String bookName;
	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
}
