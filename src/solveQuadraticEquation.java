import java.util.Scanner;

public class solveQuadraticEquation {
    public static void main(String[] args) {
        int a=1;
        int b=5,c=2;
        float res=b*b-(4*a*c);
        if(res>0.0){
            double r1 = (-b + Math.pow(res, 0.5)) / (2.0 * a);
            double r2= (-b - Math.pow(res, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (res == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
        }
    }
