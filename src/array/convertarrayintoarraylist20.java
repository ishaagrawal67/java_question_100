package array;

import java.util.ArrayList;

public class convertarrayintoarraylist20 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            a.add(arr[i]);
        }
        System.out.println(a);
    }
}
