package array;

public class commonelementbtwtwoarray15 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr1={1,10,11,12,3};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
