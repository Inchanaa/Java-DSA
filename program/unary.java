public class unary {

    public static void main(String[] args) {

        // a++     -> first --> change value a++=11
        //         -> step 2 --> use value    

        int a = 10, b= 0;
        b = a++;
        System.out.println(a);              //11
        System.out.println(b);              //10

        // ++a        -> step 1 --> use value    
         //      ->      step 2 --> change value 

       int  c = 10, d= 0;
        d = ++c;
        System.out.println(c);              //11
        System.out.println(d);              //11

    }
}