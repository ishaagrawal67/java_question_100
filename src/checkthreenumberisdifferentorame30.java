import java.util.Scanner;

public class checkthreenumberisdifferentorame30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three numbers");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int o=sc.nextInt();
        if(n==m && n==o){
                System.out.println("all numbers are same");
        }
        else if((n==m || n==o || o==m)){
            System.out.println("neither all are same or different");
        }
        else{
            System.out.println("all numbers are different");
        }

    }
}
