package hh.swd20.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import hh.swd20.Bookstore.web.BookController;
import hh.swd20.Bookstore.web.CategoryController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BookstoreApplicationTests {

	@Autowired
	private BookController bookcontroller;
	
	@Autowired
	private CategoryController catcontroller;
	
	@Test
	public void contextLoads() {
		assertThat(bookcontroller).isNotNull();
		assertThat(catcontroller).isNotNull();
	}

}
