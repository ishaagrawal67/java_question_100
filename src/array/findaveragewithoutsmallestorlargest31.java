package array;

public class findaveragewithoutsmallestorlargest31 {
    public static void main(String[] args) {
        int[] a={1,2,6,7,3,12,10};
        int n=a.length;
        int max=a[0];
        int min=a[0];
        for(int i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
            else if(min>a[i]){
                min=a[i];
            }
        }
        int s=0;
        int t=0;
        for(int i=0;i<n;i++){
            if(max!=a[i] && min!=a[i]){
                s=s+a[i];
                t++;
            }
        }
        int at=s/t;
        System.out.println("average the array elment without smallest and largest is "+at);
    }
}
