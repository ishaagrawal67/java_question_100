package array;
public class findmaxandmin11 {
    public static void main(String[] args) {
    int[] arr={1,9,10,5,8};
    int max=arr[0];
    int min=arr[0];
    for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            max=arr[i];
        }
        else if(min>arr[i]){
             min=arr[i];
        }
    }
        System.out.println(max);
        System.out.println(min);
    }
}
