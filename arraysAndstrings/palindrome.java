//string to check palindrome or not

package arraysAndstrings;

import java.util.Scanner;

public class palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
          System.out.println(rev);
        if(str.equals(rev)){
            System.out.println(str+ " is palindrome");
        }
        else
        {
            System.out.println(str+ " is not palindrome");
        }
}
}