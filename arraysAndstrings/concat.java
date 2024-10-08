package arraysAndstrings;
import java.util.*;

public class concat {
    public static void main(String[] args) {
        String s1 = "java";  // String literal 
        String s = "literal";
        String s2 = new String("java");  // String object
        String s3 = s2;  // Reference to the same String object as s2

        // Using .equals() to compare the values of the strings
        System.out.println(s1 == s2);  // false (different references)
        System.out.println(s1 == s3);  // false (different references)
        System.out.println(s2 == s3);  // true (same reference)

        // Using .equals() for value comparison
        System.out.println(s1.equals(s2));  // true (same value)
        System.out.println(s1.equals(s3));  // true (same value)
        System.out.println(s2.equals(s3));  // true (same value)

        // String concatenation examples
        String s4 = s1 + " programming";  // Concatenation using +
        System.out.println(s4);  // Output: java programming

        String s5 = s1.concat(" language");  // Concatenation using concat method
        System.out.println(s5);  // Output: java language

        String add = s1 + " ana " + s;
        System.out.print(add);
    }
}
