package String;

public class beforunicodepoint03 {
    public static void main(String[] args) {
        String str="java exercise";
        int val=str.codePointAt(1);
        int val1=str.codePointBefore(9);
        System.out.println(val);
        System.out.println(val1);
    }
}
