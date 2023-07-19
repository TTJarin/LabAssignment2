package problemE2_4;
import java.awt.*;
public class PerimeterTesterRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4,5,6);
        PerimeterTester perimeterTester = new PerimeterTester();
        System.out.println(perimeterTester.getPerimeter((int)rectangle.getHeight(),(int)rectangle.getWidth()));
    }


}
