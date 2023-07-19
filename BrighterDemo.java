package problemE2_10;
import java.awt.Color;
import java.util.concurrent.Callable;

public class BrighterDemo {
    public static void main(String[] args) {
        Color rgb = new Color(50,100,150);
        Color brighter = rgb.brighter();
        System.out.println("The value of Red :" + brighter.getRed());
        System.out.println("The value of Green :" + brighter.getGreen());
        System.out.println("The value of Blue :" + brighter.getBlue());
    }

}
