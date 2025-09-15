package patterns_question;

import java.util.Scanner;

// prime numbers
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter prime number");
        int n = sc.nextInt();
        System.out.println("1\n2\n3");
        for (int i = 4; i <= n; i++) {
            if (i % i == 0 && i % 2 != 0 && i % 3 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
