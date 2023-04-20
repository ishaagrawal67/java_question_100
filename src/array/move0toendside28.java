package array;

import java.util.Arrays;

public class move0toendside28 {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 2, 0, 5};
        int c=0;
        int n=a.length;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[c++]=a[i];
            }
        }
        while(c<n){
            a[c++]=0;
        }
        for (int p:a) {
            System.out.println(p);
        }
//        Arrays.sort(a);
//        for(int i=n-1;i>=0;i--){
//            System.out.println(a[i]);
//        }
    }
}
