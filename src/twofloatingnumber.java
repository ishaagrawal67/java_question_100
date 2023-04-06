import java.util.Scanner;

public class twofloatingnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float f1=sc.nextFloat();
        float f2= sc.nextFloat();
        if(f1==f2){
            System.out.println("they are same");
        }
        else{
            System.out.println("they are different");
        }
    }
}
