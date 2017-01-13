package model;

import Interface.Hand;
import Interface.Head;
import Interface.Leg;
import Interface.Robot;

public class RobotT1000 implements Robot {

    private Hand hand;
    private Leg leg;
    private Head head;

    public RobotT1000() {
    }

    public RobotT1000(Hand hand, Leg leg, Head head) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    @Override
    public void action(){
        hand.catching();
        leg.leg();
        head.think();
    }

    @Override
    public void dance() {
        System.out.println("Dancing");
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }
}
