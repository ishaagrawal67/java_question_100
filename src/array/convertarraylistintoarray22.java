package array;

import java.util.ArrayList;

public class convertarraylistintoarray22 {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(0,1);
        arr.add(1,2);
        arr.add(2,3);
        arr.add(3,4);
        arr.add(4,5);
        int[] a=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            a[i]=arr.get(i);
        }
        for(int p :a){
            System.out.println(p);
        }
    }
}
