package by.tms.hw_robot;

import by.tms.hw_robot.hands.IHand;
import by.tms.hw_robot.heads.IHead;
import by.tms.hw_robot.legs.ILeg;

public class Robot implements IRobot {

    private IHead head;
    private IHand hand;
    private ILeg leg;


    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot() {

    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }

    /**
     * Get the cost of a robot
     *
     * @return int
     */
    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }
}