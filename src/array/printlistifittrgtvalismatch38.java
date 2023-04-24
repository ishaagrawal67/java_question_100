package array;

import java.util.ArrayList;
import java.util.List;

public class printlistifittrgtvalismatch38 {
    public static void main(String[] args) {
        int[] a={1,0,-2,5,-1,-4};
        int n=a.length;
        int val=2;
        List<List<Integer>> arr=new  ArrayList<List<Integer>>();

        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++) {
                    s =a[i]+a[j]+a[k];
                    List<Integer> my=new ArrayList<>();
                    if (s == val) {
                        my.add(a[i]);
                        my.add(a[j]);
                        my.add(a[k]);
                        arr.add(my);
                    }
                }
            }
        }
        System.out.println(arr);
    }
}
