package array;

import java.util.ArrayList;
import java.util.Arrays;

public class lengthremovingduplicate35 {
    public static void main(String[] args) {
        int[] a={1,2,10,5,6,1,8,2,4};
        Arrays.sort(a);
        int n=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                n=n+1;
                System.out.println(a[i]);;
            }
        }
        System.out.println("after removing duplicate the array length will be "+(n+1));
    }
}
