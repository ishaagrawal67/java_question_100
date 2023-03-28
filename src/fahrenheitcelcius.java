import java.util.Scanner;
public class fahrenheitcelcius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=((n-32)*5)/9;
        System.out.println(s);

    }
}
