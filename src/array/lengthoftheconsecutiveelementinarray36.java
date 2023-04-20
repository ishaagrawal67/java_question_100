package array;

public class lengthoftheconsecutiveelementinarray36 {
    public static void main(String[] args) {
        int[] a={10,9,1,5,2,3,67,45,4};
        int n=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]+1){
                    n=n+1;
                    System.out.println(a[i]);
                }
            }
        }
        System.out.println((n+1));
    }
}
