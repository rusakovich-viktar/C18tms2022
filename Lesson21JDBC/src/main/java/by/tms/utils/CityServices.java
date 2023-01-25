package by.tms.utils;

import by.tms.model.City;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CityServices {
    private static final String GET_ALL_CITIES_STUDENTS_QUERY = "SELECT * FROM city";


    public static List<City> getAllCities() {
        List<City> cities = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_CITIES_STUDENTS_QUERY);
            ResultSet rs = preparedStatement.executeQuery();
//            Statement statement = connection.createStatement(); //обьект для создания запросов
//            ResultSet rs = statement.executeQuery(GET_ALL_STUDENTS_QUERY); //сам запрос и его результат
            while (rs.next()) {
                Long id = rs.getLong("id");
                String name = rs.getString("city");
                cities.add(new City(id, name));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cities;
    }

//    Вряд ли это то что нужно, Нужно же собрать с обеих таблиц данные в один метод
//upd:   пока писал коммит к пулреквесту понял что надо сделать
// не пойму как снять данные из обоих таблиц, или нужно вывести значения в общую таблицу через join и снять значения как из одной?

}
