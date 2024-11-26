//constructor which has parameter -- parameterized constructor

package OOPS;

class Student{
    String name;
    int id;
    // void st(){
    //     // this.name = nm;
    //     System.out.println(name+" information ");
    // }
    Student(String name,int id){
        this.name = name;
        this.id = id;
    System.out.println("'Student name is '"+name);
    System.out.println("'Student id is '"+id);
    }
}
public class parameterizedC {
    public static void main(String[] args){
        Student s= new Student("anu", 30);
        // s.st();
    }
}