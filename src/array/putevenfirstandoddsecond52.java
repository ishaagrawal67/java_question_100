package array;

import java.util.Arrays;

public class putevenfirstandoddsecond52 {
    public static void main(String[] args) {
        int[] arr={20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
        int n=arr.length;
        int[] arr1=new int[n];
        int l=0, r=n-1;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr1[l]=arr[i];
                l++;
            }
            else{
                arr1[r]=arr[i];
                r--;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
