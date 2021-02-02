package oop.msic;

public class Student implements Cloneable{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public static void main(String[] args) {
        try {
            Student s1 = new Student(19016,"Tanver");
            Student s2 = (Student)s1.clone();
            System.out.println(s1.rollNo+" "+s1.name);
            System.out.println(s2.rollNo+" "+s2.name);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }


}
