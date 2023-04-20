package array;

public class printallpairwhosesumisequaltothenumber24 {
    public static void main(String[] args) {
        int n=15;
        int[] arr={1,10,4,6,7,9};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int s=arr[i]+arr[j];
                if(s==n){
                    System.out.println(arr[i]+"+"+arr[j]+"="+n);
                }
            }
        }

    }
}
