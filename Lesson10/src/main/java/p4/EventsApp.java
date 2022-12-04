package p4;

public class EventsApp {
    public static void main(String[] args) {
        {
            Button button = new Button(new ButtonClickHandler());
            button.click();
            button.click();
            button.click();
        }

        {
            Button button = new Button(new EventHandler() {
                @Override
                public void execute() {
                    System.out.println("Кнопка нажата!");
                }
            });
            button.click();
            button.click();
            button.click();
        }
    }
}
