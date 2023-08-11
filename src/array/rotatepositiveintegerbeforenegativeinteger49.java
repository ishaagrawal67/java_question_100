package array;

import java.util.Arrays;

public class rotatepositiveintegerbeforenegativeinteger49 {
    public static void main(String[] args) {
        int[] arr={-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
        int[] arr1=new int[arr.length];
        int l=0,r=arr.length-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
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
