package hh.swd20.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import hh.swd20.Bookstore.domain.Book;
import hh.swd20.Bookstore.domain.BookRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class BookRepositoryTest {
	
	@Autowired
	private BookRepository brepository;
	
	@Test
	public void findByAuthorShouldReturnBook() {
		List<Book> books = brepository.findByAuthor("Mika Waltari");
		
		assertThat(books).hasSize(1);
		assertThat(books.get(0).getTitle()).isEqualTo("Turms Kuolematon");
	}
	
	@Test
	public void createNewBook() {
		Book book = new Book("Title", "Author", "4388732", 1932, null);
		brepository.save(book);
		assertThat(book.getId()).isNotNull();
	}
	
	@Test
	public void DeleteBook() {
		long bookid = 6;
		brepository.deleteById(bookid);
	}

}
