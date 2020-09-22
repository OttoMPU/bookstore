package hh.swd20.Bookstore.web;
import hh.swd20.Bookstore.domain.Book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BookController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getBooks(Model model) {
		List<Book> books = new ArrayList<Book>(); 
		model.addAttribute("books", books);
		return "bookstore";
	}
	
	
}
