// comparison operations

package arraysAndstrings;

public class compare{
    public static void main(String args[]){
        String s = new String("java");              //object created
        String s2 = "java";                         //literal
        String s3 = s;
        System.out.println(s.compareTo(s3));            // both r equal -- 0
        System.out.println(s==s2);                  //false 
        System.out.println(s.compareTo(s2));        //0
        System.out.println(s3==s);                  //true


        String s4 = "ab";
        String s5 ="ac";
        System.out.println(s4.compareTo(s5));           //if ascii value as more value i.e., c>b so it returns -ve value
                                                    // else return +ve value if equal returns 0

    }
}