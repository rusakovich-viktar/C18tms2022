package by.tms.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Store {
    private List<Product> products;

    public List<Product> getProducts() {
        if (products == null) {
            products = new ArrayList<>();   //проверка для инициализации (создай список если его product==null)
        }
        return products;
    }
}
