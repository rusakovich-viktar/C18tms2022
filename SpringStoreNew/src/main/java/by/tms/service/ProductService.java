package by.tms.service;

import by.tms.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();

    Product getProductById(int id);

    List<Product> getProductsByCategoryId(int categoryId);
}