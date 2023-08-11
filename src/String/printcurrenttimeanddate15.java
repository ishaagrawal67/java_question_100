
package String;
import java.util.Calendar;

public class printcurrenttimeanddate15 {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        System.out.println("current date and time is ");
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);
    }
}
