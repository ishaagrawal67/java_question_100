package array;

import java.util.Arrays;

public class firstlargersecondminimumrearrangeinthisway50 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        int n=arr.length;
        int[] temp=new int[n];
        int small=0,larg=n-1;
        boolean b=true;
        for(int i=0;i<n;i++){
            if(b){
                temp[i]=arr[larg--];
            }
            else{
                temp[i]=arr[small++];
            }
            b=!b;
        }
        System.out.println(Arrays.toString(temp));
    }
}
