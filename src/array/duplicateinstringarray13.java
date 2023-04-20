package array;

public class duplicateinstringarray13 {
    public static void main(String[] args) {
        String [] str={"bn","bm","fl","bn"};
        String s="";
        for(int i=0;i<str.length;i++){
            for(int j=i+1;j<str.length;j++){
                if (str[i].equals(str[j])) {
                    s = str[i];

                }
            }
        }
        System.out.println(s);
    }
}
