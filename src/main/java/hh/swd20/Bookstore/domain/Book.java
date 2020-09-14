package hh.swd20.Bookstore.domain;

public class Book {
	private String title;
	private String author;
	private int isbn;
	private float price;
	
	public Book() {
		this.title = null;
		this.author = null;
		this.isbn = 0;
		this.price = 0;
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

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return title + author + isbn + price;
	}
	
}
