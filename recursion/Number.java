package recursion;

import java.util.Scanner;

// print number from n to 1

public class Number {
public static void printNum(int n){
    if(n <= 0){
      return;  
    }
    System.out.println(n);
    printNum(n-1);
    
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        printNum(n);
        System.out.println();
    }
}
