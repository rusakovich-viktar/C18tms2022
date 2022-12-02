package p4;

public class Button {
    private final EventHandler eventHandler;

    public Button(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public void click() {
        eventHandler.execute();
    }
}
