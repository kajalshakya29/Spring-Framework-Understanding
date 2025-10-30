package learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class MyTransport extends MyBike
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");

//        Vehicle myBike=(Vehicle) applicationContext.getBean("myBike");
//        myBike.drive();
//        MyTyre myTyre=(MyTyre) applicationContext.getBean("myTyre");
//        System.out.println(myTyre);
        MyCar myCar=(MyCar) applicationContext.getBean("myCar");
        myCar.drive();
    }
}
