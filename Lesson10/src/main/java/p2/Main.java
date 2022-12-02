package p2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Messenger messenger = new Viber();
        Messenger messengerDesktop = new Telegram();

//        messengerDesktop.sendMessage();
//        messengerDesktop.getMessage();

//        Client client = new Client(messenger);
//        client.info();

        List<Messenger> messengers = new ArrayList<>();
        messengers.add(messenger);
        messengers.add(messengerDesktop);
        messengers.add(new Zoom());

        Client client2 = new Client(messengers);
        client2.info();
//        Messenger clientMessenger = client.getMessenger();
//        clientMessenger.sendMessage();
//        clientMessenger.getMessage();
    }
}
