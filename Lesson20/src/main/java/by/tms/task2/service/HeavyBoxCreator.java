package by.tms.task2.service;

import by.tms.task2.model.HeavyBox;
import lombok.experimental.UtilityClass;

@UtilityClass
public class HeavyBoxCreator {

    public static HeavyBox creator(String name, int weight) {
        if (weight < 0) {
            weight = 0;
        }
        return new HeavyBox(name, weight);
    }
}