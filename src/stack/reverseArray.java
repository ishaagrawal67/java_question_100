package stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr={1,2,3,4};
       Stack<Integer> a=new Stack<>();
        for (int j : arr) {
            a.push(j);
        }

       for(int i=0;i< arr.length;i++){
           arr[i]=a.pop();
       }
        System.out.println(Arrays.toString(arr));
    }
}
