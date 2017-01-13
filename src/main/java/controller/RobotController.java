package controller;

import model.RobotT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotController {

    public static void main(String[] args) {

       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       RobotT1000 robotT1000 = (RobotT1000) context.getBean("modelT100");
       robotT1000.dance();
       robotT1000.action();
    }
}
