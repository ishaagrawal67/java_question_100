import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int r=0;
        while(n>0){
            int temp=n%10;
            r=r*10+temp;
            n=n/10;
        }
        if(t==r){
            System.out.println("the number is armstrong");
        }
        else{
            System.out.println("the number is not armstrong");
        }

    }
}
