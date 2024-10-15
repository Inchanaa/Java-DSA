package OOPS;

public class polymorphism{
    public static void main(String args[]){
        cat c = new cat();
        Dog d = new Dog();
        animal a = new animal();
        c.sound();
        d.sound();
        a.sound();              //extends cat
        a.sound1();
    }
}