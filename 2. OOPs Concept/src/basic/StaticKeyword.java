package basic;

public class StaticKeyword {
    int rollNo;
    String name;
    static String institution="MBSTU";
    private StaticKeyword(int roll,String nam){
        rollNo = roll;
        name=nam;
    }
    private void display(){
        System.out.println(rollNo+" "+name+" "+institution);
    }
    public static void main(String[] args) {
        StaticKeyword s1 = new StaticKeyword(19016,"Tanver");
        StaticKeyword s2 = new StaticKeyword(19017,"Sheuly");
        StaticKeyword s3 = new StaticKeyword(19018,"Tarique");
        StaticKeyword s4 = new StaticKeyword(19019,"Bonna");
        StaticKeyword s5 = new StaticKeyword(19020,"Utsha");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
    }
}
