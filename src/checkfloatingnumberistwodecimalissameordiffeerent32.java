import java.util.Scanner;

public class checkfloatingnumberistwodecimalissameordiffeerent32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        float f1=sc.nextFloat();
        float f2=sc.nextFloat();
        if(Math.abs(f1-f2)<=0.01){
            System.out.println("all are same");
        }
        else{
            System.out.println("all are different");
        }
    }
}
