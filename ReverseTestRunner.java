package problemE2_9;

public class ReverseTestRunner {
    public static void main(String[] args) {
        ReveseTester reveseTester = new ReveseTester();
        String name = "desserts";
        System.out.println("Expected String : stressed");
        System.out.println("Reversed String : " + reveseTester.reverseString(name));
    }
}
