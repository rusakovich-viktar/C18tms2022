package by.tms.onlinestore.service;

import by.tms.onlinestore.model.Product;
import by.tms.onlinestore.repository.ProductRepository;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.getProducts();
    }

    public Product getProductById(int id) {
        return productRepository.getProductById(id);
    }

    public List<Product> getProductsByCategoryId(int categoryId) {
        return productRepository.getProductsByCategoryId(categoryId);
    }
}
