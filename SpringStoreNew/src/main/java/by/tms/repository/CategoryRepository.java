package by.tms.repository;

import by.tms.model.Category;

import java.util.List;

public interface CategoryRepository {

    List<Category> getCategories();

    Category getCategory(int id);
}
