package array;

public class testtwoarrayareequalornot25 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={1,2,3,5,6};
        boolean s=true;
        for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    s=false;
                }
        }
        if(s==true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
