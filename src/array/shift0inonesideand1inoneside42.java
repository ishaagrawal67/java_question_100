package array;

import java.util.ArrayList;

public class shift0inonesideand1inoneside42 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0};
        int[] ar=new int[arr.length];
        int l = 0, r = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
                if(arr[i]==0){
                    ar[l]=arr[i];
                    l++;
                }
                else{
                    ar[r]=arr[i];
                    r--;
                }
        }
        for(int i:ar){
            System.out.println(i);
        }

    }
}
