// Enter 3 numbers from the user & make a function to print their average.

package functions;
import java.util.*;

public class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        average(m,n,k);
    }
    public static void average(float a, float b, float c){
        float avg =(a+b+c)/3;
        System.out.println(avg);
    }
}