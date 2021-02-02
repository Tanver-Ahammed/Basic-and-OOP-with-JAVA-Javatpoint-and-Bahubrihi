package basic;

public class StudentMethod {
    int rollNo;
    String name;
    void insertRecord(int r,String n){
        rollNo=r;
        name=n;
    }
    void displayInformation(){
        System.out.println(rollNo+" "+name);
    }
}
class TestStudent{
    public static void main(String[] args) {
        StudentMethod sm1 = new StudentMethod();
        StudentMethod sm2 = new StudentMethod();
        StudentMethod sm3 = new StudentMethod();
        StudentMethod sm4 = new StudentMethod();

        sm1.insertRecord(19016,"Tanver");
        sm2.insertRecord(19017,"Sheuly");
        sm3.insertRecord(19018,"Tarique");
        sm4.insertRecord(19019,"Bonna");

        sm1.displayInformation();
        sm2.displayInformation();
        sm3.displayInformation();
        sm4.displayInformation();
    }


}
