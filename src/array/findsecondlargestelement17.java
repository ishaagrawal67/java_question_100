package array;

import java.util.Arrays;

public class findsecondlargestelement17 {
    public static void main(String[] args) {
        int[] a={1,10,9,5,6,11};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
             max=a[i];
            }
        }
        System.out.println("maximum element "+max);
        int ar=a[0];
        for(int i=0;i<a.length;i++){
            if(ar<a[i] && a[i]!=max){
                ar=a[i];
            }
        }
        System.out.println("second maximum element "+ar);
    }
}
