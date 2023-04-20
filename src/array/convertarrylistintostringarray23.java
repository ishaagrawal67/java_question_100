package array;

import java.util.ArrayList;

public class convertarrylistintostringarray23 {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>();
        str.add("isha");
        str.add("divyanshu");
        str.add("gauri");
        str.add("alisha");
        String[] a=new String[str.size()];
        for(int i=0;i<str.size();i++){
            a[i]=str.get(i);
        }
        for(String p:a){
            System.out.println(p);
        }
    }
}
