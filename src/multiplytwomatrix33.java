import java.util.Scanner;

public class multiplytwomatrix33 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row size");
        int n=sc.nextInt();
        System.out.println("enter column size");
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        int[][] b=new int[n][m];
        int[][] c=new int[n][m];
        System.out.println("enter the first matrix element");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the second matrix element");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               c[i][j]=0;
                for (int k = 0; k < m; k++) {
                    c[i][j]=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("after multiplying the matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(c[i][j]);
            }
        }
    }
}
