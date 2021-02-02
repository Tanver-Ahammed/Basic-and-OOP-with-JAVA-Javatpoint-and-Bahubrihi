package encapsulation;

public class Client {
    public static void main(String[] args) {
        Character c = new Character("A","male","Running",500,800);

        c.useAbility();
        c.setName("Tanver");
        System.out.println(c.getName());

        c.setName("Akil");
        c.setAbility("Teaching");

        c.useAbility();



    }
}
