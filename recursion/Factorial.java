package recursion;

public class Factorial {
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        int f1 = fact(n-1);
        int f2 = f1 * n;
        return f2;

        // int fac = 1;
        // for(int i =1; i <= n; i++){
        //     fac *= i;
        // }
        // System.out.println(fac);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
