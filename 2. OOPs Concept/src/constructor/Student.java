package constructor;
//Example of parameterized constructor
public class Student {
    int id;
    String name;
    private Student(int i,String n){
        id=i;
        name=n;
    }
    private void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Student stObj1 = new Student(19016,"Tanver");
        Student stObj2 = new Student(19017,"Sheuly");

        stObj1.display();
        stObj2.display();
    }
}
