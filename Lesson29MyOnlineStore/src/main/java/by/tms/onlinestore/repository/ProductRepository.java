package by.tms.onlinestore.repository;

import by.tms.onlinestore.model.Product;
import java.util.List;

public interface ProductRepository extends Repository {

    List<Product> getProducts();

    Product getProductById(int id);

    List<Product> getProductsByCategoryId(int categoryId);
}
