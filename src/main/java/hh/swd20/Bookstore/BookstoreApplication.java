package hh.swd20.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.swd20.Bookstore.domain.Book;
import hh.swd20.Bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {
			Book b1 = new Book("Turms kuolematon", "Mika Waltari", "123-0-20750-0", 1956);
			Book b2 = new Book("Crime And Punishment", "Fyodor Dostoyevsky ", "0143058142", 1866);
			
			repository.save(b1);
			repository.save(b2);
			
		};
	}
	
}
