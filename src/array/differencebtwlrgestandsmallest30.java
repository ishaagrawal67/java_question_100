package array;

public class differencebtwlrgestandsmallest30 {
    public static void main(String[] args) {
        int[] a={10,11,4,5,6,12,9,8};
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
            else if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("the difference between the largest and smallest between is "+(max-min));
    }
}
