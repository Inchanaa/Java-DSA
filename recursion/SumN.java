package recursion;

public class SumN {
    public static void sum(int n){
        int sum = 0;
        for (int index = 0; index < n; index++) {
            sum = sum + index;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int n = 10;
        sum(n);
        
    }
}
