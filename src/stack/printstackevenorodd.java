package stack;

import java.util.Stack;

public class printstackevenorodd {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        int i=0;
        while(i<=10){
          st.push(i);
          i=i+2;
        }
        int j=1;
        while(j<=10){
            st2.push(j);
            j=j+2;
        }
        System.out.println("even stack");
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
        System.out.println("odd stack");
       while(!st2.isEmpty()){
           System.out.println(st2.pop());
       }

    }
}
