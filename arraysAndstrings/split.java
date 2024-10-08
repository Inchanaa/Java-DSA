//  split the string into single character

package arraysAndstrings;
import java.util.*;

public class split{
    public static void name(String s){
        
           int space = s.indexOf(" ");
           for(int i =0; i<s.length();i++){
            if(i==space){
                continue;
            }
            System.out.print(s.charAt(i)+",");
            }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        name(input);
    }
}