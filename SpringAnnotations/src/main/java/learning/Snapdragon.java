package learning;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Snapdragon implements MobileProcessor{
    @Override
    public void processor() {
        System.out.println("World's best cpu");
    }
}
