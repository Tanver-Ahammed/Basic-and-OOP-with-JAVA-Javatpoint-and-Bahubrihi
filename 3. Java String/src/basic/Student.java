package basic;

public class Student {
    int idNo;
    String name;
    String city;

    public Student(int idNo, String name, String city) {
        this.idNo = idNo;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "idNo=" + idNo + ", name='" + name + ", city='" + city ;
    }

    public static void main(String[] args) {
        Student s1 = new Student(19016,"Tanver","Joypurhat");
        System.out.println(s1);
        Student s2 = new Student(19017,"Sheuly","Tangail");
        System.out.println(s2);
        Student s3 = new Student(19018,"Tarique","Tangail");
        System.out.println(s3);
        Student s4 = new Student(19019,"Bonna","Tangail");
        System.out.println(s4);

    }
}
