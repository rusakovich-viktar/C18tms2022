package by.tms.onlinestore.repository;

import by.tms.onlinestore.model.Category;
import java.util.List;

public interface CategoryRepository {

    List<Category> getCategories();

    Category getCategory(int id);
}
