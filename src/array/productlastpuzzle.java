package array;

import java.util.ArrayList;
import java.util.Collections;

public class productlastpuzzle {
    public static void main(String[] args) {
//        int n=8,m=5;
//        int[] arr={3, 4, 1, 9, 56, 7, 9, 12};
//        ArrayList<Integer> a=new ArrayList<>();
//        for(int i=0;i<n;i++){
//            a.add(arr[i]);
//        }
//        Collections.sort(a);
//        long ans = Long.MAX_VALUE;
//        System.out.println(ans);
//        for(int i=0; i<=n-m; i++){
//            long diff= a.get(m+i-1) - a.get(i);
//            ans = Math.min(ans,diff);
//        }
//        System.out.println(ans);

        int n=5;
        int[] arr={10, 3, 5, 6, 2};
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            int p=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    p=p*arr[j];
                }
            }
            a.add(p);
        }
        System.out.println(a);
    }
}
