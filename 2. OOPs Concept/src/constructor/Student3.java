package constructor;
//Copying values without constructor
public class Student3 {
    int id;
    String name;
    private Student3(int id,String name){
        this.id=id;
        this.name=name;
    }
    private Student3() {
    }
    private void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Student3 s1 = new Student3(19016,"Tanver");
        Student3 s2 = new Student3();

        s2.id=s1.id;
        s2.name=s1.name;

        s1.display();
        s2.display();
    }
}
