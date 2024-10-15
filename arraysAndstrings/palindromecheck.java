//palindrome check with out using inbuilt function

package arraysAndstrings;

import java.util.*;

public class palindromecheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean isPalindrome = false;
        int length = str.length();
        for(int i=0;i<length / 2 ; i++){
            if(str.charAt(i) == str.charAt(length - i -1)){
                isPalindrome = true;
                break;
            }

        }
        if(isPalindrome){
            System.out.println(str+ " is palindromw");
        }
        else
           System.out.println(str+ " is not palindrome");
    }
}