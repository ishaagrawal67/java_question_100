package array;
import java.util.*;
public class finduniqueelement {
    public static void main(String[] args) {
//       int  n = 6, m = 5;
//        int a[] = {1, 2, 3, 4, 5, 6};
//        int b[] = {3, 4, 5, 6, 7};
//        HashSet<Integer> set=new HashSet<>();
//        int c=0;
//        for(int i=0;i<n;i++){
//            set.add(a[i]);
//        }
//        for(int i=0;i<m;i++){
//            if(set.contains(b[i])){
//                c++;
//                set.remove(b[i]);
//            }
//        }
//        System.out.println(c);
        int arr1[] = {5 ,5 ,8 ,8 ,8 ,9 ,11 ,11 ,11 ,11 };
        int arr2[] = {4 ,4 ,4 ,4 ,6 ,8 ,9 ,9 ,9 ,11 };
        int n=arr1.length;
        int m=arr2.length;
        int l=n+m;
        int[] result=new int[l];
        int p=0;
        for(int e:arr1){
            result[p]=e;
            p++;
        }
        for(int e:arr2){
            result[p]=e;
            p++;
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
//        Set<Integer> set=new HashSet<>();
//        for(int i=0;i<n;i++){
//            set.add(arr1[i]);
//        }
//        for(int i=0;i<m;i++){
//            set.add(arr2[i]);
//        }
//        int currentIndex = 1;
//
//        // Desired Index
//        int desiredIndex = 2;
//
//        for (int element :set) {
//            // Implementing for loop
//
//            if (currentIndex == desiredIndex)
//            {
//                System.out.println( element);
//                break;
//            }
//            currentIndex++;
//
//    }
//        System.out.println(set);
}}

