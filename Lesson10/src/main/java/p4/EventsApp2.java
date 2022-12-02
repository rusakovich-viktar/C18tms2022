package p4;

public class EventsApp2 {
    public static void main(String[] args) {
        Button button = new Button(new EventHandler() {
            private boolean on = false;

            @Override
            public void execute() {
                if (on) {
                    System.out.println("Телевизор выключен");
                    on = false;
                } else {
                    System.out.println("Телевизор включен");
                    on = true;
                }
            }
        });

        Button printButton = new Button(new EventHandler() {
            @Override
            public void execute() {
                System.out.println("Запущена печать на принтере");
            }
        });

        button.click();
        printButton.click();
        button.click();
    }
}
