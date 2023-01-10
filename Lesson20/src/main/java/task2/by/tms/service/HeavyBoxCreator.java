package task2.by.tms.service;

import lombok.experimental.UtilityClass;
import task2.by.tms.model.HeavyBox;

@UtilityClass
public class HeavyBoxCreator {

    public static HeavyBox creator(String name, int weight) {
        if (weight < 0) {
            weight = 0;
        }
        return new HeavyBox(name, weight);
    }


}
