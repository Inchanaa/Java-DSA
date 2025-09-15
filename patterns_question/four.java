package patterns_question;

public class four {
  public static void main(String[] args) {
    int n = 5, m = 5, i, j;
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= m; j++) {
        if (i <= j) {
          System.out.print("*");
        } else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}
/*
                          *****
                          ****
                          ***
                          **
                          *             */