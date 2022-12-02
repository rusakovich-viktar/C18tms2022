package stat4;

import lombok.Getter;

@Getter
public class External {
    private int value;// если добавить статик то что?

    public External(int value) {
        this.value = value;
    }

    static class Inner {
        static int value;
    }
}
