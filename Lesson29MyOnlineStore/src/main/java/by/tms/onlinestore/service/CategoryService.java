package by.tms.onlinestore.service;

import by.tms.onlinestore.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getCategories();

    Category getCategoryById(int id);

    Category getCategoryByName(String name);
}
