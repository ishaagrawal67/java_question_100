import java.util.Scanner;

public class Floatingnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float s=sc.nextFloat();
        if(s>0.0){
            if(s<1.0){
                System.out.println("Smaller positive number");
            }
            else if(s>10000.0){
                System.out.println("Largest Positive Number");
            }
            else{
                System.out.println("Positive Number");
            }
        }
        else if(s<0.0){
            if(Math.abs(s)<1.0){
                System.out.println("Smaller Negative Number");
            }
            else if(Math.abs(s)>10000.0){
                System.out.println("Largest Negative Number");
            }
            else{
                System.out.println("Negative Number");
            }
        }
        else{
            System.out.println("zero");
        }
    }
}
