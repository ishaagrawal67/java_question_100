package array;

public class checkarraygivensumisequalbysortedorrotatedarray46 {
    public static void main(String[] args) {
        int n=42;
        int[] arr={22,25,17,18,19,20};
        int l=arr.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(arr[i]+arr[j]==n){
                    System.out.println("Array has a pair of elements with sum 42.");
                }
            }

        }

    }
}
