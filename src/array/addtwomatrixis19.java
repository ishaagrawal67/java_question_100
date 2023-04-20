package array;

import java.util.Arrays;
import java.util.Scanner;

public class addtwomatrixis19 {
    public static void main(String[] args) {
        int[][] arr=new int[2][2];
        int[][] arr1=new int[2][2];
        int[][] c=new int[2][2];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(c[i][j]);
            }
        }
        System.out.println(Arrays.toString(c));

    }
}
