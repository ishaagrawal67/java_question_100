import java.util.Scanner;
class bubble{
    public void search(int[] arr){
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j]){
                   int temp=arr[j];
                   arr[j]=arr[i];
                   arr[i]=temp;
               }
           }
       }
        System.out.println("srray after sorting");
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
}
public class bubblesort62 {
    public static void main(String[] args) {
        bubble s=new bubble();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the element");
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        s.search(arr);
    }
}
