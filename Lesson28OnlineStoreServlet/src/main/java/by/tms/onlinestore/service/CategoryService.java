package by.tms.onlinestore.service;

import by.tms.onlinestore.model.Category;
import by.tms.onlinestore.repository.CategoryRepository;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CategoryService implements CategoryServiceAware {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategories() {
        return categoryRepository.getCategories();
    }

    @Override
    public Category getCategoryById(int id) {
        return categoryRepository.getCategory(id);
    }

    @Override
    public Category getCategoryByName(String name) {
        return null;
    }
}
