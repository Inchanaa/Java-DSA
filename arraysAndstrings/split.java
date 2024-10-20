//  split the string into single character

package arraysAndstrings;
import java.util.*;

public class split{
    //    System.out.println("hii \"double\" ");
    // System.out.println("");


    public static void name(String s){
     
        //  String g = s.replaceAll("\\s","");     \\ "\\sis for white space 
            String g = s.replaceAll(" ","");
           for(int i =0; i<g.length();i++){
            // if(i==space){
            //     continue;
            // }
            System.out.print(g.charAt(i));
            if(i<g.length()-1){
                System.out.print(",");      //, for all character except last
            }
            }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        name(input);
        sc.close();
    }
}