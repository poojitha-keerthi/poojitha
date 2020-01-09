package com.spring.web.springCase.entity;
import javax.persistence.Entity;
@Entity
public class Book 
{
	int bookid;
    String booktitle;
    double price;
    String authour;
    public Book(){}
	public Book(int bookid, String booktitle, double price, String authour) 
	{
	    this.bookid = bookid;
		this.booktitle = booktitle;
		this.price = price;
		this.authour = authour;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthour() {
		return authour;
	}
	public void setAuthour(String authour) {
		this.authour = authour;
	}
    
}
