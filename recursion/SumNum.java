package recursion;

public class SumNum {
    public static void sum(int i, int sum, int n){
       if(n == i){
        sum = sum + i;

        System.out.println(sum);
        return;

       }
        sum = sum + i;
        sum(i+1 , sum,n);
    }
    public static void main(String[] args) {
        sum(1, 0,3);
    }
}
