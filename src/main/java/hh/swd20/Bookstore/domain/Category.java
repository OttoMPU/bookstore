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
	
	private String category;
	
	public Category() {
		super();
		this.categoryid = null;
		this.category = null;
	}
	
	public Category(Long categoryid, String category) {
		super();
		this.categoryid =categoryid;
		this.category = category;
	}
	
	public Category(String category) {
		super();
		this.category = category;
	}
	
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public Long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}
	
	
}
