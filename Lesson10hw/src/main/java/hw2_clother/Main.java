package hw2_clother;

/*По аналогии с первым задание делаем след. задание.
        Интерфейсы:
        - Куртка
        - Штаны
        - Обувь
        в каждом интерфейсе есть 2 метода (надеть и снять)
        Делаем несколько реализации каждого интерфейса.
        Создаём класс человек:
        У человека поля:
        -имя
        -куртка
        -штаны
        -обувь
        У человека есть 2 метода:
        - одеться(вызываются методы надетьдеть у всех вещей)
        - раздеться (вызываются методы снять у всех вещей)*/

import hw2_clother.jacket.JacketNike;
import hw2_clother.shoes.ShoesCaterpillar;
import hw2_clother.trousers.TrousersBershka;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Valera", new JacketNike(),
                new ShoesCaterpillar(), new TrousersBershka());
        System.out.println(person1.toString());
        person1.putOnAll();
        System.out.println(" ");
        person1.pullOffAll();

    }
}