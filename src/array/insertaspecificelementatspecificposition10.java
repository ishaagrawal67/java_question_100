package array;

import java.util.Scanner;

public class insertaspecificelementatspecificposition10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter s specific postion");
        int i=sc.nextInt();
        System.out.println("enter s specific element");
        int v=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the element");
        for(int j=0;j<n;j++){
            a[j]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            if(j==i){
                a[j]=v;
            }
        }
        System.out.println("print the array");
        for(int j=0;j<n;j++){
            System.out.println(a[j]);
        }

    }
}
