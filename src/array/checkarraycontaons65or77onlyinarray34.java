package array;

public class checkarraycontaons65or77onlyinarray34 {
    public static void main(String[] args) {
        int [] a={65,65,77,65,65,10,65};
        boolean t=true;
        for(int i=0;i<a.length;i++){
            if(a[i]!=65 && a[i]!=77){
                t=false;
            }
        }
        if(t){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
