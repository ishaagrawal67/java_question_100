package array;

import java.util.Scanner;

public class testarrycontainspecificvalue06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the specific value");
        int m=sc.nextInt();
        System.out.println("enter the element");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int g=0;
        for(int i=0;i<n;i++){
            if(arr[i]==m){
               g=1;
               break;
            }
        }
        if(g==1){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
    }
}
