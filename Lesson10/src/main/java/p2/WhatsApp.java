package p2;

public class WhatsApp implements Messenger {
    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в WhatsApp!");
    }

    @Override
    public void getMessage() {
        System.out.println("Читаем сообщение из WhatsApp!");
    }
}
