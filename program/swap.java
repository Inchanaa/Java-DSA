// swap a 2 numbers


import java.util.Scanner;

public class swap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        System.out.println("temp"+temp);
        a =  b;
        System.out.println("a "+a);
        System.out.println("b "+b);
        b = temp;
        System.out.println("b "+b);
        System.out.println("resylt1" +a+","+b);                //result of swap

        System.out.println("without using temp or 3rd variable");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("result2 "+a+","+b);                //again swaping the result from above swap
        sc.close();
    }
}