// displan an array and search an element in the array and display its index

package arrays;
import java.util.Scanner;

public class twoDimension{
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
        }}
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
        }
        System.out.println("Enter an element to search");
        int s = sc.nextInt();
        boolean found = false;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            if(a[i][j]==s){
            System.out.println("Element "+a[i][j]+" found at position ("+i+" , "+j+ ")");
            found = true;
            break;     
            }  //stop searching once found
        }
        if(found) break;
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}