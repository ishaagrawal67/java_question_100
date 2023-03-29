import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int s=n;
        int r=0;
        int c=0;
        while(n>0){
            c++;
            n=n/10;
        }

        while(s>0){
            int temp=s%10;
             r=(int)Math.pow(temp,c)+r;
            s=s/10;
        }
        if(t==r){
            System.out.println("the number is armstrong");
        }
        else{
            System.out.println("the number is not armstrong");
        }
    }
}
