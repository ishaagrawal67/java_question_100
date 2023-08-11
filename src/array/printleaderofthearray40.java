package array;

public class printleaderofthearray40 {
    public static void main(String[] args) {
       int arr[] = {10, 9, 14, 23, 15, 0, 9};
       int n=arr.length;
       for(int i=0;i<n;i++){
           int j;
           for(j=i+1;j<n;j++){
               if(arr[i]<=arr[j]){
                   break;
               }
           }
           if(j==n){
               System.out.println("leaders are "+arr[i]);
           }
       }
    }
}
