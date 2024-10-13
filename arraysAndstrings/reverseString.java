// reverse a string with out using reverse()

package arraysAndstrings;
import java.util.*;

 
public class reverseString{
    public static void rev(String str){
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String s = rev(str);
        // System.out.print(s);
        rev(str);
    }
}