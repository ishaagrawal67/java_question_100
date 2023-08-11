package String;

public class createstringfromchararray11 {
    public static void main(String[] args) {
        char[] arr=new char[]{'1','2','3','4','5'};
        String str=String.copyValueOf(arr,1,2);
        System.out.println(str);

    }
}
