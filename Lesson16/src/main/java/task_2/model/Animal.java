package task_2.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Animal implements IAnimal, Serializable {

    private String name;
    private int age;

    @Override
    public void go() {
        System.out.println("Животное идет");
    }
}