import java.util.Scanner;

class linear{
    public static void search(int[] arr,int m){
//        for(int i=0;i<arr.length;i++){ this if sor multiple values in single array
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    System.out.println(arr[i]);
//
//                }
//            }
// this is for a prticular value
        for(int i=0;i<arr.length;i++){
            if(m==arr[i]){
                System.out.println(i);
            }
        }
    }
}
public class linearsearch60 {
    public static void main(String[] args) {
        //linear s=new linear();
        Scanner sc=new Scanner(System.in);
        System.out.println("length of the array");
        int n=sc.nextInt();
        System.out.println("enter the lement of arr");
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();

        linear.search(arr,m);
    }
}
