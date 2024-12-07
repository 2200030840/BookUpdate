package com.klef.jfsd.exam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_table")
public class Book 
{
	@Id
	@Column(name = "bid")
	private int bookid;
	@Column(name = "btitle", length = 15, nullable = false)
	private String title;
	@Column(name = "bauthor", length = 30, nullable = false)
	private String author;
	@Column(name = "bprice", nullable = false)
	private double price;
	@Column(name = "bpublishyear", nullable = false)
	private String publishyear;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublishyear() {
		return publishyear;
	}
	public void setPublishyear(String publishyear) {
		this.publishyear = publishyear;
	}
}
