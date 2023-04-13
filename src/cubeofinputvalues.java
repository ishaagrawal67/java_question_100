import java.util.Scanner;

public class cubeofinputvalues {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            c=i*i*i;
            System.out.println("the number of "+i+" is "+c);
        }
    }
}
