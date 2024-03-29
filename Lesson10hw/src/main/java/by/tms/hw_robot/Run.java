package by.tms.hw_robot;

import by.tms.hw_robot.hands.SamsungHand;
import by.tms.hw_robot.hands.SonyHand;
import by.tms.hw_robot.hands.ToshibaHand;
import by.tms.hw_robot.heads.SamsungHead;
import by.tms.hw_robot.heads.SonyHead;
import by.tms.hw_robot.heads.ToshibaHead;
import by.tms.hw_robot.legs.SamsungLeg;
import by.tms.hw_robot.legs.SonyLeg;
import by.tms.hw_robot.legs.ToshibaLeg;

public class Run {

    public static void main(String[] args) {

        Robot[] robots = new Robot[3];
        {
            Robot robot = new Robot(new ToshibaHead(11), new SonyHand(50), new SamsungLeg(70));
            robots[0] = robot;
            robot.action();
            System.out.printf("Стоимость робота равна %d\n", robot.getPrice());
            System.out.println("===");
        }
        {
            Robot robot = new Robot(new SonyHead(45), new SamsungHand(56), new ToshibaLeg(87));
            robots[1] = robot;
            robot.action();
            System.out.printf("Стоимость робота равна %d\n", robot.getPrice());
            System.out.println("===");
        }
        {
            Robot robot = new Robot(new SamsungHead(56), new ToshibaHand(33), new SonyLeg(33));
            robots[2] = robot;
            robot.action();
            System.out.printf("Стоимость робота равна %d\n", robot.getPrice());
            System.out.println("===");
        }

        int positionRobot = -1;
        int maxPrice = robots[0].getPrice();
        for (int i = 0; i < robots.length; i++) {
            if (robots[i].getPrice() > maxPrice) {
                maxPrice = robots[i].getPrice();
                positionRobot = i + 1;
            }
        }
        System.out.printf("Робот в списке № %d самый дорогой и стоит %d ", positionRobot, maxPrice);
    }

        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


}
