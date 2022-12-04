package p2_1;

import lombok.Getter;

@Getter
public class Smartphone {
    private final MobileApplication application; //установленое приложение на смартфоне(только в мобильном телефоне)

    public Smartphone() {
        this.application = new Telegram();
    }
}
