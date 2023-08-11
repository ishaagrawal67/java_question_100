package String;

public class comparestringlexicographicallywithoutdifferences06 {
    public static void main(String[] args) {
        String str="this is exercise 1";
        String str1="this is exercise 2";
        int t=str.compareToIgnoreCase(str);
        System.out.println(t);
        if(t<0){
            System.out.println("the string is less than");
        }
        else if(t>0){
            System.out.println("the string is greator than other string");
        }
        else{
            System.out.println("string  is equal");
        }
    }
}
