package model;//4) Создать класс model.Person, который будет содержать следующие поля имя,
// возраст, пол, адрес(страна, город)

public class Person {
    private String name;
    private int age;
    private String gender;
    private Address address;

    public Person(String name, int age, String gender, Address address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public Person() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person(name=" + this.getName() + ", age=" + this.getAge() + ", gender=" + this.getGender() + ", address=" + this.getAddress() + ")";
    }
}
