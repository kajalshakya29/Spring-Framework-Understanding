package learn;

import org.springframework.stereotype.Component;

@Component
public class MyBike implements  Vehicle {
    public void drive(){
        System.out.println("its driving..");
    }
}
