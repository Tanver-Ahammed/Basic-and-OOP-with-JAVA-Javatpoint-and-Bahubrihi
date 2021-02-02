package inheritance;

public class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name,Address address) {
        this.id = id;
        this.name = name;
        this.address=address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address address1=new Address("Joypurhat","Rajshahi","Bangladesh");
        Address address2=new Address("Tangail","Dhaka","Bangladesh");

        Emp e=new Emp(19016,"Tanver",address1);
        Emp e2=new Emp(19019,"Bonna",address2);

        e.display();
        e2.display();

    }
}
