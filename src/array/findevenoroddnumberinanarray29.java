package array;

import java.util.ArrayList;

public class findevenoroddnumberinanarray29 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        int e=0;
        int o=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                e++;
                even.add(a[i]);
            }
            else{
                o++;
                odd.add(a[i]);
            }
        }
        System.out.println("total even number is "+e+" numbers are "+even);
        System.out.println("total odd number is "+o+" numbers are "+odd);
    }
}
