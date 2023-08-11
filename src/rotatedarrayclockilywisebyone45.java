import java.util.Arrays;

public class rotatedarrayclockilywisebyone45 {
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 40, 50, 60};
        int r=1;
        while(r>0){
            int temp=arr[arr.length-1];
            for(int i=arr.length-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
