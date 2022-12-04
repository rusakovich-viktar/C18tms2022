package p2;

public class Telegram implements Messenger {

    @Override
    public void sendMessage() {
        System.out.println("отправляем сообщение в Telegram!");
    }

    /**
     * методы сами не пишем только гереним с помощью идеи.
     */
    @Override
    public void getMessage() {
        System.out.println("Читаем сообщение из Telegram!");
    }
}
