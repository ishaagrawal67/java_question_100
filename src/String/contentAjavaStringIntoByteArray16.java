package String;

public class contentAjavaStringIntoByteArray16 {
    public static void main(String[] args) {
        String str="Isha Agrawal";
        byte[] bA=str.getBytes();
        String st=new String(bA);
        System.out.println(st);
    }
}
