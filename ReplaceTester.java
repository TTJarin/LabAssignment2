package problemE2_7;

public class ReplaceTester {
    private String name;
    public ReplaceTester(){
        name = "Mississippi";
    }
    public String replace(){
        String newName = null;
        newName = name.replace("i","!").replace("s","$");
        return newName;
    }
}
