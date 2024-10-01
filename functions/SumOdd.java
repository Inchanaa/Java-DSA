// Write a function to print the sum of all odd numbers from 1 to n.
package functions;
import java.util.*;

class SumOdd {
    public static void sumOdd(int n){
            int sum = 0;
        for(int i =1; i<=n;i++){
        if((i+1)%2 == 0){
             sum = sum + i;
        }
    }
      System.out.println(sum);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sumOdd(n);
    }
}