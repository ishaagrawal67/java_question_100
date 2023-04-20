package array;

public class findcommonnthreearray27 {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={5,6,2,3,7,8};
        int[] c={10,11,12,2,3};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<b.length;j++){
                for(int k=j+1;k<c.length;k++){
                    if((a[i]==b[j] && b[j]==c[k])){
                        System.out.println(a[i]);
                    }
                }

            }
        }
    }
}
