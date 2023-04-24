package array;

public class printmajorityelement39 {
    public static void main(String[] args) {
        int[] a={1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2};
        int n=a.length;
        int c=0;
        int m=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && (a[i]==a[j])){
                    c++;
                    m=a[i];
                }
            }
            if(c<(n/2)){
                c=0;
                m=0;
            }
        }
        System.out.println("the majority element "+m);
    }
}
