package operator;
public class unary {

    public static void main(String[] args) {
//post increment
        // a++     -> first --> change value a++=11
        //         -> step 2 --> use value    

        int a = 10, b= 0;
        b = a++;
        System.out.println(a);              //11
        System.out.println(b);              //10
        //pre increment
        // ++a        -> step 1 --> use value    
         //      ->      step 2 --> change value 

       int  c = 10, d= 0;
        d = ++c;
        System.out.println(c);              //11
        System.out.println(d);              //11


        //post decrement
        // a++     -> first --> change value a++=11
        //         -> step 2 --> use value    

        int e = 10, f= 0;
        f = e--;
        System.out.println(e);              //9
        System.out.println(f);              //10

        //pre decrement
        // ++a        -> step 1 --> use value    
         //      ->      step 2 --> change value 

       int  g = 10, h= 0;
        h = --g;
        System.out.println(g);              //9
        System.out.println(h);              //9

    }
}