package p2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;


/**
 * Mы проектируем программу, в которой у нас будут собраны данные клиентов.
 * В классе Client обязательно нужно поле, указывающее, каким именно мессенджером клиент пользуется.
 */
@AllArgsConstructor
@Getter
public class Client {
    /**
     * при выходе нового месенджера придется объявлять глобальную переменную
     */
//    private WhatsApp whatsApp;
//    private Telegram telegram;
//    private Viber viber;
//    private Zoom zoom;


//    private final Messenger messenger; // or

    private List<Messenger> messengers;

    void info() {
//        whatsApp.getMessage();
//        telegram.getMessage();
//        viber.getMessage();
//        zoom.getMessage();
//        messenger.getMessage();


        for (Messenger messenger : messengers) {
            messenger.getMessage();
        }
    }
}
