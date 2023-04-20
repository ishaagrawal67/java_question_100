package array;

public class checkthearrayhavenot0or132 {
    public static void main(String[] args) {
        int[] a={1,2,4,5,0,-1,9};
        int n=a.length;
        boolean p=true;
        for(int i=0;i<n;i++){
            if(a[i]==0 || a[i]==-1){
                p=false;
            }
        }
        if(p==true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
