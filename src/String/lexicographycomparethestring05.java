package String;

public class lexicographycomparethestring05 {
    public static void main(String[] args) {
        String str="this is exercise 1";
        String str1="this is exercise is 2";
        int  t=str.compareTo(str1);
        System.out.println(t);
        if(t==0){
            System.out.println("the string is not equal");
        }
        else if (t<0){
            System.out.println("the string is less than the ither string");
        }
        else{
            System.out.println("the string  is greator tham the other string");
        }
    }
}
