package by.tms.onlinestore.repository.impl;

import by.tms.onlinestore.model.Product;
import by.tms.onlinestore.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

import static by.tms.onlinestore.utils.ProductHelper.products;

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
