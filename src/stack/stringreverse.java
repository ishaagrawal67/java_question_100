package stack;

import java.util.Scanner;
import java.util.Stack;

public class stringreverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        Stack<Character> ch=new Stack<>();
        for(int i=0;i<str.length();i++){
            ch.push(str.charAt(i));
        }
        str="";
        while(!ch.isEmpty()){
            str+=ch.pop();
        }
        System.out.println(str);


    }
}
