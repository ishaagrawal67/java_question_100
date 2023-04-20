package array;

public class findcommonelementbetweentwostring14 {
    public static void main(String[] args) {
        String[] str={"isha","divyanshu","alisha"};
        String[] str2={"gauri","isha","kajal"};
        for(int i=0;i<str.length;i++){
            for (int j = 0; j < str2.length; j++) {

            if(str[i].equals(str2[j])){
                System.out.println(str[i]);
            }
            }
        }
    }
}
