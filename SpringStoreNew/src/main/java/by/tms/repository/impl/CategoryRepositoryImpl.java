package by.tms.repository.impl;

import by.tms.model.Category;
import by.tms.repository.BaseRep;
import by.tms.repository.CategoryRepository;
import by.tms.repository.utils.ConnectionWrapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class CategoryRepositoryImpl extends BaseRep implements CategoryRepository {

    private static final String PATH_TO_STORE = "SELECT * FROM \"online-store\".categories";

    @Override
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        try (ConnectionWrapper connectionWrapper = connectionPool.getConnectionWrapper();
             Statement statement = connectionWrapper.getConnection().createStatement()) {
            ResultSet rs = statement.executeQuery(PATH_TO_STORE);
            while (rs.next()) {
                Category category = Category.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .imageName(rs.getString("imageName"))
                        .build();
                categories.add(category);
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return categories;
    }

    @Override
    public Category getCategory(int id) {
        return null;
    }
}