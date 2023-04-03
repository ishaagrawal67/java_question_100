import java.util.Scanner;

public class findlengthconcatenatereplacestring43 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println("length of the string is "+s1.length());
//        System.out.println("concatenate of the string is "+(s1+s2));
        System.out.println(s1.concat(s2));
        System.out.println("replace by other string is "+s1.replace("isha","agrawal"));
    }
}
