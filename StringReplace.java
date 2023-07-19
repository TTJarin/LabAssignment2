package problemE2_1;

public class StringReplace {
    private String statename;
    public StringReplace(){
        statename = "Mississippi";
    }
    public StringReplace(String statename){
        this.statename = statename;
    }
    public int replace1(){
        String newStateName = null;
        int newLength;
        newStateName = statename.replace("i","ii");
        newLength=newStateName.length();
        return newLength;
    }
    public int replacess(){
        String newStateName = null;
        int newLength;
        newStateName = statename.replace("ss","s");
        newLength=newStateName.length();
        return newLength;
    }

}
