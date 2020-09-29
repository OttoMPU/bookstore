package hh.swd20.Bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long categoryid;
	
	private String categoryname;
	
	public Category() {
		super();
		this.categoryid = null;
		this.categoryname = null;
	}
	
	public Category(Long categoryid, String categoryname) {
		super();
		this.categoryid =categoryid;
		this.categoryname = categoryname;
	}
	
	public Category(String categoryname) {
		super();
		this.categoryname = categoryname;
	}
	
	
	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
	public Long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}
	
	
}
