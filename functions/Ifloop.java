// Write a function that takes in age as input and returns if that person is eligible to vote or not.
//  A person of age > 18 is eligible to vote.

package functions;

import java.util.Scanner;

public class Ifloop{
    public static boolean age(int n){
        if(n > 18)
        return true;
        else
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(age(n)==true){
        System.out.println("can vote");
    }
        else
        System.out.println("can not vote");
    }
}