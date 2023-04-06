import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class stringtodate85 {
    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        Date date1=f. parse(s);
        System.out.println(s+ "  " +date1);
    }
}
