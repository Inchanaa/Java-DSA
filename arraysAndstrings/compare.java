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
        System.out.println(s3.equals(s));           //true
        System.out.println(s2.equals(s));           //true

        String s4 = "aba";
        String s5 ="ac";
        System.out.println(s4.compareTo(s5));           //if ascii value as more value i.e., b<c so it returns -ve value
                                                    // else return +ve value if equal returns 0

    }
}