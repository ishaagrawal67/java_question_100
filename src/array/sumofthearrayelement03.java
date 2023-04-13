package array;

import java.util.Scanner;

public class sumofthearrayelement03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the element");
        int [] m=new int [n];
        for (int i = 0; i < n; i++) {
            m[i]=sc.nextInt();
        }
        int s=0;
        for (int i=0;i<n;i++){
            s=s+m[i];
        }
        System.out.println("the sum of the array element "+s);
    }
}
