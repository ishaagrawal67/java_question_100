import java.util.Scanner;

public class printdaybymonthoryear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int year= sc.nextInt();

        if(n==1){
            System.out.println("January "+year+"  has 31 days");
        }
        else if(n==2){
            if(year%400==0||year%4==0||year%100!=0) {
                System.out.println("February "+year+" has 29 days");
            }
            else {
                System.out.println("February "+year+" has 28 days");
            }
        }
        else if(n==3){
            System.out.println("March "+year+" has 31 days");
        }
        else if(n==4){
            System.out.println("April "+year+" has 30 days");
        }
        else if(n==5){
            System.out.println("May "+year+" has 31 days");
        }
        else if(n==6){
            System.out.println("June "+year+" has 30 days");
        }
        else if(n==7){
            System.out.println("July "+year+"  has 31 days");
        }
        else if(n==8){
            System.out.println("August "+year+"  has 31 days");
        }
        else if(n==9){
            System.out.println("September "+year+"  has 30 days");
        }
        else if(n==10){
            System.out.println("October "+year+" has 31 days");
        }
        else if(n==11){
            System.out.println("November "+year+"  has 30 days");
        }
        else if(n==12){
            System.out.println("December "+year+"   has 31 days");
        }
    }
}
