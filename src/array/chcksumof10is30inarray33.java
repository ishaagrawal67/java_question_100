package array;

public class chcksumof10is30inarray33 {
    public static void main(String[] args) {
        int[] arr={1,4,5,6,10,10};
        int c=0;
        int t=30;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==10){
                c=c+arr[i];
            }
        }
        if(c==t){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
