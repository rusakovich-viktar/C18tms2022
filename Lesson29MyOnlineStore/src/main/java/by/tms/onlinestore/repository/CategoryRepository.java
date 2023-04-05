package by.tms.onlinestore.repository;

import by.tms.onlinestore.model.Category;
import java.util.List;

public interface CategoryRepository extends Repository {

    List<Category> getCategories();

    Category getCategory(int id);
}
