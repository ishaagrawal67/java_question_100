import java.util.Scanner;

public class lepyear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n%400==0 || (n%4==0 && n%100!=0)){
            System.out.println("the year is leap year");
        }
        else{
            System.out.println("the year is not leap year");
        }
    }
}
