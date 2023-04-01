import java.util.Scanner;

public class addtwomatrix32 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row size");
        int n=sc.nextInt();
        System.out.println("enter column size");
        int m=sc.nextInt();
        int[][] A= new int[n][m];
        int[][] B=new int [n][m];
        System.out.println("enter first array element");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 A[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter second array element");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                B[i][j]=sc.nextInt();
            }
        }
        int[][] C=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               C[i][j]=A[i][j]+B[i][j];
            }
        }
        System.out.println("sum of the two array element");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(C[i][j]);
            }
        }
    }
}
