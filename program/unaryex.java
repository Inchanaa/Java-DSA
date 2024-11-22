public class unaryex {
    public static void main(String[] args) {
        int a = 10,b=0;
        int res = a++ + b;                                  // a value is assigned not incremented to result
        System.out.println("result : " + res);              //10

        int res1 = ++a + b;
        System.out.println("result 1 : "+res1);            // value first incrementd then assigned  -- >  12

        // a = 12 , b = 0
        int res3 = a++ + b++ + ++a;                     //12+0+14 -->  12(+1) + 0(+1) + 13+1
        System.out.println("result 3 : "+res3);

        // a = 14 b=1
        int res4 = ++a + ++b + a + b++ + ++b;
        System.out.println("result 4 : " +res4); 
    }
}
