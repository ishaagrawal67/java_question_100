package array;

public class printsumtrgetvluindx37 {
    public static void main(String[] args) {
        int[] a={1,2,4,5,6};
        int s=0;
        int t=6;
        for(int i=0;i<a.length-1;i++){
            s=a[i]+a[i+1];
            if(s==6){
                System.out.println("index "+i+" index "+(i+1));
            }
            else{
                System.out.println("no pair");
            }
        }
    }
}
