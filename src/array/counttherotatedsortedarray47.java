package array;

import java.util.jar.JarOutputStream;

public class counttherotatedsortedarray47 {
    public static void main(String[] args) {
        int[] arr={35,32,30,14,18,21,27};
        int n=arr.length;
        int min=arr[0];
        int minin=0;
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
                minin=i;
            }
        }
        System.out.println(minin);
    }
}
