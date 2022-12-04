package p6;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@AllArgsConstructor
@ToString
public class DayOfWeek {
    private final String name;

    public DayOfWeek(String name) {
        this.name = name;
    }

    public static final DayOfWeek SUNDAY = new DayOfWeek("воскресенье");
    public static final DayOfWeek MONDAY = new DayOfWeek("понедельник");
//    и тд

    public static void main(String[] args) {
//        SUNDAY.getName()
//        DayOfWeek.MONDAY
    }
}
