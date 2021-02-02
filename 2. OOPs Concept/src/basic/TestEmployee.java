package basic;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();

        e1.insertData(19016,"Tanver",250000);
        e2.insertData(19017,"Sheuly",25000);
        e3.insertData(19018,"Tarique",50000);
        e4.insertData(19019,"Bonna",20000);
        e5.insertData(19020,"Utsha",55000);

        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
    }
}
