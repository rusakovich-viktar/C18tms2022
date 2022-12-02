package p2_1;

import lombok.Getter;
import p2.Messenger;

@Getter
public class Client {
    private final Messenger messenger;

    public Client() {
        this.messenger = new Telegram();
    }
}
