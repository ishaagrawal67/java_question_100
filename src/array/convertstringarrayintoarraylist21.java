package array;

import org.w3c.dom.DOMStringList;

import java.util.ArrayList;

public class convertstringarrayintoarraylist21 {
    public static void main(String[] args) {
        String[] str={"isha","divyanshu","bhanu","parth"};
        ArrayList<String> s=new ArrayList<>();
        for(int i=0;i<str.length;i++){
            s.add(str[i]);
        }
        System.out.println(s);
    }
}
