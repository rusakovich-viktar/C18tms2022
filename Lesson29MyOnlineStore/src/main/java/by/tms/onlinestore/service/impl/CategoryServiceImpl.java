package by.tms.onlinestore.service.impl;

import by.tms.onlinestore.model.Category;
import by.tms.onlinestore.model.Inject;
import by.tms.onlinestore.repository.CategoryRepository;
import by.tms.onlinestore.service.CategoryService;
import lombok.Setter;

import java.util.List;

@Setter
public class CategoryServiceImpl implements CategoryService {
    @Inject
    private CategoryRepository categoryRepository;

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
