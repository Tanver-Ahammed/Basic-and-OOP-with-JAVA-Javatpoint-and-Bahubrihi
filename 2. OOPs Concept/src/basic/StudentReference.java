package basic;

public class StudentReference {
    int id;
    String name;
}
class Student1 {
    public static void main(String[] args) {
        StudentReference s1 = new StudentReference();
        StudentReference s2 = new StudentReference();
        s1.id = 19016;
        s1.name = "Tanver";

        s2.id = 19017;
        s2.name = "Sheuly";

        System.out.println("ID: " + s1.id+"  "+s1.name);
        System.out.println("ID: " + s2.id+"  "+s2.name);
    }
}
