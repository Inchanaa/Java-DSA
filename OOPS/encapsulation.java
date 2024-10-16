// instead of get or set we can use any name but for readability v use get and set


package OOPS;

class employe{
    private int id;
    private String name;
    public int getId(){
        return id;
    }
    public void setId(int idd){
        this.id = idd;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class encapsulation{

    public static void main(String args[]){
        employe e = new employe();
        e.setId(1);
        e.setName("anu");
        System.out.println("id "+e.getId()+ "\nname "+e.getName());
    }
}