import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
class binary{
    public void search(int[] arr,int low,int high,int m){
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==m){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    }
}
public class binarysearch41 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the value");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int low=0;
        int high=arr.length-1;
        System.out.println("enter the value");
        int m=sc.nextInt();
        binary s=new binary();
        s.search(arr,low,high,m);
    }
}
