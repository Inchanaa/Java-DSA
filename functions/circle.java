// Write a function that takes in the radius as input and returns the circumference of a circle.

package functions;
import java.util.*;

public class circle{
    final float pi = 3.14;
    public static void circumference(int n){
        int cir = 2*pi*n;
        System.out.print(cir);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }

}