package problemE2_3;
import java.awt.*;

public class AreaTesterRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4,5,6);
        AreaTester areaTester = new AreaTester();
        System.out.println(areaTester.getArea((int)rectangle.getHeight(),(int)rectangle.getWidth()));
    }
}
