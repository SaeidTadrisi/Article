import model.Category;
import infrastructure.CategoryRepository;

import java.util.List;

public class FakeCategory implements CategoryRepository {


    @Override
    public List<Category> getAllCategories() {
        return List.of(
                new Category("Technology", ".Everything about Technology"),
                new Category("Programing", "Books for all programing languages"));
    }

    @Override
    public void saveNewCategory(Category category) {

    }
}
