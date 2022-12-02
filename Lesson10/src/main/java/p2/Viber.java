package p2;

public class Viber implements Messenger {

    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в Viber!");
    }

    @Override
    public void getMessage() {
        System.out.println("Читаем сообщение из Viber!");
    }
}
