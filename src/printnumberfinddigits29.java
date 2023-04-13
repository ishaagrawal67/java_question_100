import java.util.Scanner;

public class printnumberfinddigits29 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int c=0;
        while(n>0){
            int temp=n%10;
            c=c+1;
            n=n/10;
        }
        System.out.println("the digits in this number is "+c);
    }
}
