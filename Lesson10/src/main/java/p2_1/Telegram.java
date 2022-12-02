package p2_1;

import p2.Messenger;

/**
 * Множественная реализация.
 * Телеграмм может быть как мессенджер на виндовс и как мобильное приложение
 */
public class Telegram implements MobileApplication, Messenger {
    @Override
    public void sendMessage() {
        System.out.println("sendMessage");
    }

    @Override
    public void getMessage() {
        System.out.println("getMessage");
    }

    @Override
    public void info() {
        System.out.println("info");
    }
}
