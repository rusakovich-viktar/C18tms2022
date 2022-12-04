package p1;

public class Main {
    public static void main(String[] args) {

        Animal animal2 = new Animal();
//        animal2.setName("Мурзик");

        Animal animal3 = new Animal("Мурзик");
        System.out.println(animal3.getName());

        Cow cow = new Cow("Корова", "кастом");
        System.out.println(cow.getName());

        Cow cow2 = new Cow();
//        cow2.setName("Корова");
        System.out.println(cow2.getName());
//        cow2.setName("Корова2");
        System.out.println(cow2.getName());

        Animal animal4 = new Animal();
        System.out.println(animal4.name);

        System.out.println("!!!");
        Animal cow3 = new Cow();
        cow3.speak();//

        Animal[] animals = new Animal[3];
        animals[0] = new Cow();
        animals[1] = new Dog("dog");
        animals[2] = new Cat("cat");
        animals[2] = new CustomCow("CustomCow", "Custom", "белый");

        printAnimalInfo(animals);


//        cow3.name = "sdfsdf";//не хочу давать возможность!
        System.out.println("!!!");

        CustomCow customCow1 = new CustomCow("Custom");
        customCow1.speak();
//        customCow1.customSpeak();

//        Cat animal = new Cat("Мурзик");
////        animal.setName("Мурзик");
//        animal.speak();
//
//        Cow cow = new Cow("Зорька");
//        System.out.println(cow);
////        cow.name = "Зорька234";
////        System.out.println(cow.name);
//        System.out.println(cow.getName());
//        cow.speak();
//
//        System.out.println("-----");
//        Cow cow2 = new Cow("Зорька");
////        cow2.setName("Зорька");
//        cow2.speak();


        Animal animal = new CustomCow("cow");
        animal.speak();//полиморфизм//speak для коровы
        System.out.println("!!" + animal.getName());//полиморфизм//speak для коровы
//        System.out.println("!!" + animal.name);//Animal name


        System.out.println(((CustomCow) animal));

        if (animal instanceof CustomCow) {
            CustomCow customCow = (CustomCow) animal;
            customCow.info();
        } else if (animal instanceof Cat) {
            Cat animal1 = (Cat) animal;
        }


//        Animal animal1 = new Animal("animal");
//        animal1.speak();
//
//        Animal animal = createAnimal(1);
//        animal.speak();


//        Animal.speak();
//        Cat animal = new Cat();
//        Cow cow = new Cow();
//        Animal[] animals = new Animal[]{animal, new Dog(), cow};
//        for (Animal animal : animals) {
//            animal.speak();//полиморфизм
//        }

        Animal cow1 = new Cow("Зорька");
//        cow1.name = "Звездочка";
        Animal animal6 = new Animal();
//        animal6.name = "123";

//        System.out.println(((Cow)cow1).name);//Звездочка
//        System.out.println(((Animal)cow1).name);//
//        System.out.println(animal6.name);//123
//        System.out.println("----");
        System.out.println(cow1.getName());//Зорька
        System.out.println(animal6.getName());//Animal

    }

    private static void printAnimalInfo(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            if (animal instanceof CustomCow) {
                CustomCow customCow = (CustomCow) animal;
                System.out.println(customCow.getColor());
            }
            animal.speak();
        }
    }

    private static Animal createAnimal(int value) {
        switch (value) {
            case 0:
                return new Cat("Мурзик");
            case 1:
                return new Dog("Бельчик");
            case 2:
                return new Cow("Зорька");
        }
        return null;
    }
}
