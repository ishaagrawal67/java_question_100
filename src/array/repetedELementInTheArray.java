package array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class repetedELementInTheArray {
    public static void main(String[] args) {
        int n=26;
        int[] arr={13 ,9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15 ,11, 19, 20, 2, 4, 25, 1,4, 23 ,14};
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    if(!a.contains(arr[i])){
                    a.add(arr[i]);
                    break;
                    }
                }
            }
        }
        Collections.sort(a);
        if(a.size()!=0){
            System.out.println(a);
        }
        else{
            a.add(-1);
            System.out.println(a);
        }
    }
}
