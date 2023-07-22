package String;

public class checkstringequalornotignorecase14 {
    public static void main(String[] args) {
        String str="isha";
        String str1="Isha";
        boolean b=str.equals(str1);
        boolean bl=str.equalsIgnoreCase(str1);
        System.out.println(b);
        System.out.println(bl);
    }
}
