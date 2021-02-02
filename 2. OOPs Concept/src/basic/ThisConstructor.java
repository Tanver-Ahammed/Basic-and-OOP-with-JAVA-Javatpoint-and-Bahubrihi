package basic;

public class ThisConstructor {
    int rollNo;
    String name,course;
    float fee;

    public ThisConstructor(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    public ThisConstructor(int rollNo, String name, String course, float fee) {
        this(rollNo,name,course);//reusing constructor
        this.fee=fee;
    }
    void display(){
        System.out.println(rollNo+" "+name+" "+course+" "+fee);
    }

}
class TestThis7 {
    public static void main(String args[]) {
        ThisConstructor s1 = new ThisConstructor(19016, "Tanver", "java");
        ThisConstructor s2 = new ThisConstructor(19017, "Sheuly", "java", 6000f);
        s1.display();
        s2.display();
    }
}