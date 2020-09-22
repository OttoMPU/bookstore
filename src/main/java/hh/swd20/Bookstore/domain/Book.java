package hh.swd20.Bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String title, author, isbn;
	private double price;
	
	public Book() {
		super();
		this.id = null;
		this.title = null;
		this.author = null;
		this.isbn = null;
		this.price = 0;
	}
	
	public Book(Long id, String title, String author, String isbn, double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
	}
	
	public Book( String title, String author, String isbn, double price) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
	}
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
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



	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}
	
}
