package array;

public class secondminimumelement18 {
    public static void main(String[] args) {
        int[] arr={10,5,7,8,0,1};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("minimum element is "+min);
        int smin=arr[0];
        for(int i=0;i<arr.length;i++){
            if(smin>arr[i] && arr[i]!=min){
                smin=arr[i];
            }
        }
        System.out.println("second minimum element is "+smin);
    }
}
