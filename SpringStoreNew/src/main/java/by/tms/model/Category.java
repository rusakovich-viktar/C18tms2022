package by.tms.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Setter
@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode
public class Category {

    private int id;
    private String name;
    private String imageName;
    private List<Product> productList;

    public Category(int id, String name, String imageName) {
        this.id = id;
        this.name = name;
        this.imageName = imageName;
    }
}
