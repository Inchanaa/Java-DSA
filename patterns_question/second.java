package patterns_question;

// 5*5 square
class second {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        int i, j;
        // outer loop
        for (i = 1; i <= n; i++) {
            // inner loop
            for (j = 1; j <= m; j++) {
                if (i == 5 || j == 5 || i == 1 || j == 1) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}