package OOPS;
class student{
    String name ;
    int id;
    public void write(){
        System.out.println("Student details :");
    }
    public void details(){
        System.out.println(this.name);
        System.out.println(this.id);
    }

}
public class ClassAndObject{
    public static void main(String[] args){
        student s1 =  new student();
        s1.name = "Inchana";
        s1.id = 11;
        s1.write();
        s1.details();
    }
}