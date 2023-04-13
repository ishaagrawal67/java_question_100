import java.util.Scanner;

public class sumOf5numberandaverage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the 5 value");
        int sum=0;
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            int n=sc.nextInt();
            sum=sum+n;
        }
        int average=sum/m;
        System.out.println(sum);
        System.out.println(average);
    }
}
