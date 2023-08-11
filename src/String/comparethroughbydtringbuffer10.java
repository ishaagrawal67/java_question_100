package String;

public class comparethroughbydtringbuffer10 {
    public static void main(String[] args) {
        String str="isha";
        String st2="Isha";
        StringBuffer cs=new StringBuffer(str);
        System.out.println("coreect or not by compariosn "+str.contentEquals(cs));
        System.out.println("correct or not by comarison "+st2.contentEquals(cs));
    }
}
