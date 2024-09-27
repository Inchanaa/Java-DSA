package questions;

import java.util.*;

public class fibonacci{
    
    public static void fibb(int n){
      int f = 1;
      for(int i =n;i>=1;i--){
        f = f*i;
      } 
      System.out.print(f);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibb(n);
        // int res = fib(n);
        // System.out.print(res);
    }
}