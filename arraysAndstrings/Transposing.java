// displan an array and search an element in the array and display its index

package arraysAndstrings;
import java.util.Scanner;

public class Transposing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int row = sc.nextInt();
        int col = sc.nextInt();

        System.out.println("Enter an array");
        int[][] a = new int[row][col];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
            a[i][j] = sc.nextInt();
        }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            System.out.print(a[i][j]+" ");
        }
      System.out.println();
        }
        int[][] t = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                t[j][i] = a[i][j];
            }
        }
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}