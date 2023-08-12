package String;

public class stringgetthecanonicalstring20 {
    public static void main(String[] args) {
        String s="Isha Agrawal";
        System.out.println(s);
        String sb=new StringBuffer("Isha").append("Agrawal").toString();
        System.out.println(sb);
        String sl=sb.intern();
        System.out.println(sl);
        System.out.println(s==sb);
        System.out.println(sb==sl);
    }
}
