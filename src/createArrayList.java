import java.util.ArrayList;

public class createArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<10;i++){
            arr.add(i);
        }
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
