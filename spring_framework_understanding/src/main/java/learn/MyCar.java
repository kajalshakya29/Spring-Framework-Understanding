package learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyCar implements Vehicle {

    @Autowired
    private MyTyre myTyre;

    public MyTyre getMyTyre() {
        return myTyre;
    }

    public void setMyTyre(MyTyre myTyre) {
        this.myTyre = myTyre;
    }

    public void drive(){
        System.out.println("mycar  "+ myTyre);
    }
}
