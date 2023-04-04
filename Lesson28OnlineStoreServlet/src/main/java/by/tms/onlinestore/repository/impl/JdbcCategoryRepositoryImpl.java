package by.tms.onlinestore.repository.impl;

import by.tms.onlinestore.model.Category;
import by.tms.onlinestore.repository.CategoryRepository;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class JdbcCategoryRepositoryImpl implements CategoryRepository {

    private final Connection connection;

    @Override
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String PATHTOSTORE = "SELECT * FROM \"online-store\".categories";
            ResultSet rs = statement.executeQuery(PATHTOSTORE);
            while (rs.next()) {
                Category category = Category.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .imageName(rs.getString("imageName"))
                        .build();
                categories.add(category);
            }
        } catch (SQLException e) {
            System.out.println("Unexpected error " + e.getMessage());
        }
        return categories;
    }

    @Override
    public Category getCategory(int id) {
        return null;
    }
}