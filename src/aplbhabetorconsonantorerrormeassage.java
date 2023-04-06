import java.util.Scanner;

public class aplbhabetorconsonantorerrormeassage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String c=sc.next();
        char a=c.charAt(0);
        if(c.length()>1){
            System.out.println("Error Message");
        } else if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u' ) {
            System.out.println("alphabet is vowel");
        }
        else{
            System.out.println("alphabet is consonant");
        }
    }
}
