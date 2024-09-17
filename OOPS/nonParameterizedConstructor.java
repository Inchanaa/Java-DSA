//constructor which as no parameter
//constructor are automatically called by the time of object creation
package OOPS;
class Student{
    Student(){
        System.out.println("constructor called");
    }
    public void Studen(){
        System.out.println("constructor called 1");
    }
}
public class nonParameterizedConstructor{
        public static void main(String[] args){
            // Student s =new Student();
            Student s1 =new Student();
        s1.Studen();
        }
}