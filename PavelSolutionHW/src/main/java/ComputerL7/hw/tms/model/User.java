package ComputerL7.hw.tms.model;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String sex;

    public User(String firstName, String lastName, int age, String sex) {
        this(firstName, lastName);
        this.age = age;
        this.sex = sex;
    }

    public User(String firstName) {
        this.firstName = firstName;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstLastName() {
        return firstName + " " + lastName;
    }

    public void addAge(int age) {
//        this.age = this.age + age;
        this.age += age;
    }

    /**
     * @return
     * @See method toString()
     */
    @Deprecated
    public String info() {
        return firstName + lastName + age + sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
