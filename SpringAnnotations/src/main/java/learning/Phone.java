package learning;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Phone
{
    public static void main( String[] args ){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);

        Samsung samsung=applicationContext.getBean(Samsung.class);
        samsung.config();
//        Samsung samsung = new Samsung();
//        samsung.config();

    }
}
