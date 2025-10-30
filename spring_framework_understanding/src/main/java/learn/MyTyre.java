package learn;

import org.springframework.stereotype.Component;

@Component
public class MyTyre {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "its working...";
    }

   /* public MyTyre(String brand) {
        this.brand = brand;
    }*/

}
