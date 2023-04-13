package array;

import java.util.Arrays;
import java.util.Scanner;

public class sortstringarray02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String [] s=new String[n];
        System.out.println("enter the element");
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s[i].compareTo(s[j])>0){
                    String temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        System.out.println("after sorting the String array");
        System.out.println(Arrays.toString(s));

    }
}
