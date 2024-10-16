// Aggregation--> Has-a relation

package OOPS;

class Address{
    String city;
    String state;
    String country;

    //constructor
    public Address(String ct, String s, String c){
        this.city = ct;
        this.state = s;
        this.country = c;
    }
}
public class Aggregation{
    int id;
    String name;
    Address add;
    Aggregation(int id, String name, Address add){
        this.id = id;
        this.name = name;
        this.add = add;
    }
    void display(){
        System.out.println("id =" +id+ "\n name = " +name);
        System.out.println("Address = "+add.city+ " " +add.state+ " "+add.country);
    }
    public static void main(String args[]){
        Address a1 = new Address("bengaluru", "karnataka", "India");
        Address a2 = new Address("chennai", "Tamil Nadu", "India");

        Aggregation agg = new Aggregation(1,"amsu",a1);
        Aggregation agg2 = new Aggregation(2,"kamu",a2);
        agg.display();
        agg2.display();
    }
}