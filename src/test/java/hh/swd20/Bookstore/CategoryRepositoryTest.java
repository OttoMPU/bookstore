package hh.swd20.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import hh.swd20.Bookstore.domain.Category;
import hh.swd20.Bookstore.domain.CategoryRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class CategoryRepositoryTest {
	
	@Autowired
	private CategoryRepository crepository;
	
	@Test
	public void findCategoryByName() {
		List<Category> categories = crepository.findBycategoryname("Fantasy");
		
		assertThat(categories).hasSize(1);
	}
	
	@Test
	public void CreateNewCategory() {
		Category category = new Category("Testcategory");
		crepository.save(category);
		assertThat(category.getCategoryid()).isNotNull();
	}
	
	@Test
	public void DeleteCategory() {
		long catid = 2;
		crepository.deleteById(catid);
	}

}
