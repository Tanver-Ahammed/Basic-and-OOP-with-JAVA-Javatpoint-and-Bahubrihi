package constructor;
//copy the values of one object into another using Java constructor.
public class Student2 {
    int id;
    String name;
    private Student2(int id,String name){
        this.id = id;
        this.name = name;
    }
    private Student2(Student2 s){
        id = s.id;
        name = s.name;
    }
    private void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2(19016,"Tanver");
        Student2 s2 = new Student2(s1);

        s1.display();
        s2.display();
    }
}
