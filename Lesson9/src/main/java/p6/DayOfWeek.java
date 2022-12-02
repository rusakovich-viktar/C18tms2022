package p6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class DayOfWeek {
    private String name;

    public static final DayOfWeek SUNDAY = new DayOfWeek("воскресенье");
    public static final DayOfWeek MONDAY = new DayOfWeek("понедельник");
//    и тд

}
