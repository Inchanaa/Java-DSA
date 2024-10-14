//string to check palindrome or not

package arraysAndstrings;

import java.util.Scanner;

public class palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        // for(int i=str.length()-1;i>=0;i--){
        //     rev = Character.toString(str.charAt(i));

        // }
        // System.out.println(i);
        if(str==rev){
            System.out.println(str+ " is palindrome");
        }
        else
        {
            System.out.println(str+ " is not palindromw");
        }
    }
}