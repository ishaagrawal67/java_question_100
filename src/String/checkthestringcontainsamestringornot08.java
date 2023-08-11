package String;

public class checkthestringcontainsamestringornot08 {
    public static void main(String[] args) {
        String str="isha and agrawal";
        String str1="and";
        boolean b=str.contains(str1);
        if(b){
            System.out.println("it contain the string");
        }
        else{
            System.out.println("it is not contain the string");
        }
    }
}
