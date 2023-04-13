package array;

public class duplicateinarray12 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,5,6};
        int c=0;
        int m=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c=c+1;
                   m=arr[i];
                }
            }
        }
        if(c>0){
            System.out.println(m);
        }
    }
}
