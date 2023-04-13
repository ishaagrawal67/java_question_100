package array;

import java.util.ArrayList;
import java.util.Arrays;

public class stringreverse {
    public static void main(String[] args) {
//        String str="divyanshu";
//        char[] ch= str.toCharArray();
//        System.out.println(Arrays.toString(ch));
//        str="";
//       for(int i = ch.length-1; i>=0; i--){
//           str=str+ch[i];
//       }
//        System.out.println(str);

        String str="isha";
        ArrayList<Character> ch= new ArrayList<>();
        for(int i=0;i<str.length();i++){
            ch.add(str.charAt(i));
        }
        str="";
        for(int i = ch.size()-1; i>=0; i--){
           str=str+ch.get(i);
       }
        System.out.println(str);
    }
}
