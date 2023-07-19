package problemeE2_2;

public class UseTrimAndReplace {
    private String name;
    public UseTrimAndReplace(){
        name = " Tasnim Tahmina Jarin ";
    }
    public String useTrim(){
        return name.trim();
    }
    public String useReplace(){
        return name.replace(" ","");
    }
}
