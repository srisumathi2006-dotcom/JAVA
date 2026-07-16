package day07;
import java.util.Scanner;
public class twod_array {
    public static void main(String[]args) {
        Scanner p=new Scanner(System.in);
        int[][]a={{1,8,2},{3,6,4},{5,9,4}};
        int [][] result=new int[3][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                result[i][j]=a[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<2 ;j++)
                System.out.print(result[i][j]+" ");
        }
        System.out.println();
    }
}
