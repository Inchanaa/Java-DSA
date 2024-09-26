package patterns_question;

public class Square{
    public static void main(String args[]){
        int n = 5;
        int m = 5;
        int i,j;
        for(i=1; i<=n; i++){
            // inner loop
            for(j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}