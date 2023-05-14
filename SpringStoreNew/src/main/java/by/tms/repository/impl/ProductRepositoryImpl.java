package by.tms.repository.impl;

import by.tms.model.Product;
import by.tms.repository.ProductRepository;
import by.tms.repository.utils.BaseRep;
import by.tms.repository.utils.ConnectionWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl extends BaseRep implements ProductRepository {
    private static final String GET_ALL_PRODUCTS = "SELECT * FROM \"online-store\".products";
    private static final String GET_PRODUCT_BY_ID = "SELECT * FROM \"online-store\".products WHERE id=?";
    private static final String GET_PRODUCTS_BY_CATEGORY_ID = "SELECT * FROM \"online-store\".products WHERE category_id=?";

    @Override
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        try (ConnectionWrapper connectionWrapper = getConnectionWrapper();
             PreparedStatement statement = connectionWrapper.getConnection().prepareStatement(GET_ALL_PRODUCTS)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setImageName(resultSet.getString("image_name"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setPrice(resultSet.getBigDecimal("price"));
                product.setCategoryId(resultSet.getInt("category_id"));
                products.add(product);
            }
        } catch (Exception e) {
            System.out.println("Exception in getProducts: " + e.getMessage());
        }
        return products;
    }

    @Override
    public Product getProductById(int id) {
        try (ConnectionWrapper connectionWrapper = getConnectionWrapper();
             PreparedStatement statement = connectionWrapper.getConnection().prepareStatement(GET_PRODUCT_BY_ID)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setImageName(resultSet.getString("image_name"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setPrice(resultSet.getBigDecimal("price"));
                product.setCategoryId(resultSet.getInt("category_id"));
                return product;
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println("Exception in getProductById: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Product> getProductsByCategoryId(int categoryId) {
        List<Product> products = new ArrayList<>();
        try (ConnectionWrapper connectionWrapper = getConnectionWrapper();
             PreparedStatement statement = connectionWrapper.getConnection().prepareStatement(GET_PRODUCTS_BY_CATEGORY_ID)) {
            statement.setInt(1, categoryId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setImageName(resultSet.getString("image_name"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setPrice(resultSet.getBigDecimal("price"));
                product.setCategoryId(resultSet.getInt("category_id"));
                products.add(product);
            }
        } catch (Exception e) {
            System.out.println("Exception in getProductsByCategoryId: " + e.getMessage());
        }
        return products;
    }
}
