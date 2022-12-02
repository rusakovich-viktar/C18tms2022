package p6;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DayOfWeek2 {
    private String name;

    private DayOfWeek2(String name) {
        this.name = name;
    }

    public static final DayOfWeek2 SUNDAY = new DayOfWeek2("воскресенье");
    public static final DayOfWeek2 MONDAY = new DayOfWeek2("понедельник");
//    и тд

}
