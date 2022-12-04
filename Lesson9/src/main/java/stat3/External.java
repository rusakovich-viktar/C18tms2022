package stat3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class External {
    private int value;
    private Inner inner;

    public External(int value) {
        this.value = value;
        this.inner = new Inner(2);
    }

    void test() {
        System.out.println(inner);
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class Inner {
        public static final String TEMP = "";
        private int value;
    }
}
