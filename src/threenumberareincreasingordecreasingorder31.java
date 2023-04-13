import java.util.Scanner;

public class threenumberareincreasingordecreasingorder31 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter three number");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int o=sc.nextInt();
        if(n<m && m<o){
            System.out.println("increasing order");
        }
        else if(n>m && m>o){
            System.out.println("decreasing order");
        }
        else{
            System.out.println("neither increasing or Decreasing order");
        }
    }
}
