package by.tms.repository.impl;

import by.tms.model.Product;
import by.tms.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

import static by.tms.utils.ProductHelper.products;

@Repository
@AllArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public Product getProductById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Product> getProductsByCategoryId(int categoryId) {
        return products.stream()
                .filter(product -> product.getCategoryId() == categoryId)
                .collect(Collectors.toList());
    }
}
