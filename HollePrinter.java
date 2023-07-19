package problemE2_8;

public class HollePrinter {
    private String name;
    public HollePrinter(){
        name = "Hello, World!";
    }
    public String replace(){
        String newName = null;
        String replaceName = null;
        String newReplaceName = null;
        newName = name.replace("e","&");
        replaceName = newName.replace("o","e");
        newReplaceName = replaceName.replace("&","o");
        return newReplaceName;

    }
}
