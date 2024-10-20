// displan an array and search an element in the array and display its index

package arraysAndstrings;
import java.util.Scanner;

public class oneDimension{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        System.out.println("Enter an array");
        int[] a = new int[size];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        System.out.println("Enter an element to search");
        int s = sc.nextInt();
        boolean found = false;
        for(int i=0;i<size;i++){
            if(a[i]==s){
            System.out.print("Element "+a[i]+" found at position "+i);
            found = true;
            break;     
            }  //stop searching once found
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}