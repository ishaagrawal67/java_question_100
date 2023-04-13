import java.util.Scanner;

public class oddnumberandsumoftheirnumbernaturalnumber15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int s=0;
        int j=1;
        for(int i=1;i<=n;i++){
            System.out.println(j);
           s+=j;
           j+=2;
        }
        System.out.println("sum is "+s);
    }
}
