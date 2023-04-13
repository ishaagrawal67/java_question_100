package array;

import java.util.Scanner;

public class printaveragearrayelement05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the value");
        int[] m=new int[n];
        for(int i=0;i<n;i++){
            m[i]=sc.nextInt();
        }
        int s=0;
        for (int i = 0; i < n; i++) {
           s=s+m[i];
        }
        int a=s/n;
        System.out.println(s);
        System.out.println("average element of array is "+a);
    }
}
