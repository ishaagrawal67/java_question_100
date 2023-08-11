package array;

public class masindex {
    public static void main(String[] args) {
        int n=9;
        int[] a={34, 8, 10, 3, 2, 80, 30, 33, 1};
        int max=a[0];
        int temp=0;
        for(int i=0;i<n;i++){
             if(max<a[i]){
                 max=a[i];
                 temp=i;
             }
        }
        System.out.println(temp+1);
    }
}
