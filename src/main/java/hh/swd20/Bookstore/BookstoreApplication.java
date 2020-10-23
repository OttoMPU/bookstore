package hh.swd20.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.swd20.Bookstore.domain.Book;
import hh.swd20.Bookstore.domain.BookRepository;
import hh.swd20.Bookstore.domain.Category;
import hh.swd20.Bookstore.domain.CategoryRepository;
import hh.swd20.Bookstore.domain.User;
import hh.swd20.Bookstore.domain.UserRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository brepository, CategoryRepository crepository, UserRepository urepository) {
		return (args) -> {
			
			Category c1 = new Category("Fantasy");
			Category c2 = new Category("Sci-fi");
			Category c3 = new Category("Educational");
			Category c4 = new Category("Historical");
			
			crepository.save(c1);
			crepository.save(c2);
			crepository.save(c3);
			crepository.save(c4);
			
			
			brepository.save(new Book("Turms kuolematon", "Mika Waltari", "123-0-20750-0", 1956, c1));
			brepository.save(new Book("Crime And Punishment", "Fyodor Dostoyevsky", "0143058142", 1866, c4));
			
			User user1 = new User("user", "$2a$04$evu5Qu.514/TiM9MPx9rcuN0WQ7mubbirrXqDkbOvEM5hS/j9/Wj2", "USER");
			User user2 = new User("admin", "$2a$04$895bRHQd0/YH2yoN8IBRUeDOYL298gvjMDihWx/xnqDP.kSJPBDiW", "ADMIN");
			
			urepository.save(user1);
			urepository.save(user2);
			
		};
	}
	
}
