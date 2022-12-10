package by.tms.model;

public class Car {
    private String model;
    private int maxSpeed;
    private int price;

    public Car() {
    }

    public Car(String model, int maxSpeed, int price) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public void start() {
        if (checkStart()) {
            System.out.printf("Автомобиль %s завелся\n", model);
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private boolean checkStart() {

        try {
            int i = (int) (Math.random() * 21);
            if (i % 2 == 0) {
                throw new EvenCarException("автомобиль " + getModel() + " не завелся");
            }
        } catch (EvenCarException e) {
            System.out.println("Warning exception: " + e.getMessage());
            return false;
        }
        return true;
    }
}