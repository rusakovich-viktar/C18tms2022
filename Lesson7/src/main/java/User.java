public class User {
    //Создать поля для хранения имени и фамилии, возраста и пола.
    private String name;
    private String surName;
    private int age;
    private String gender;

    //    2) Создать в классе User несколько конструкторов. Создать объект этого класса, использовав один из них.
    public User(String name, String surName, int age, String gender) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
    }

    public User(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public User() {

    }
    //    Создать методы для:
//            *  - Возврата имени и фамилии полностью

    public String getNameSurName() {
        return name + " " + surName;
    }

//     *  - Увеличения возраста

    public void addAge(int age) {
        this.age += age;
    }

//     *  - Вывода общей информации о пользователе

    public String userInfo() {
        return name + " " + surName + ", " + age + ", " + gender;
    }

// создаем геттеры и сеттеры для каждого класса

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Deprecated
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}