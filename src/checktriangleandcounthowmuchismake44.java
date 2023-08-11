import java.util.Arrays;

public class checktriangleandcounthowmuchismake44 {
    public static void main(String[] args) {
        int[] arr={6, 7, 9, 16, 25, 12, 30, 40};
        int c=0;
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int x=i+2;
            for(int j=i+1;j<n;j++){
                while(x<n && arr[i]+arr[j]>arr[x]){
                    ++x;
                    c+=x-j-1;
                }
            }
        }
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                for(int k=j+1;k<n;k++){
//                    if(arr[i]+arr[j]>arr[k]){
//                        c++;
//                    }
//                }
//            }
//        }
        System.out.println("possible triangle are "+c);
    }
}
