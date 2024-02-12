package infrastructure;

import model.Category;

import java.util.List;

public interface CategoryRepository {
    List<Category> getAllCategories();

    void saveNewCategory(Category category);
}
