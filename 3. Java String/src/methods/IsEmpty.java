package methods;

public class IsEmpty {
    public static void main(String[] args) {
        String s1,s2;
        s1="JAVA";
        s2="";

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());

        System.out.println(s1.isBlank());
        System.out.println(s2.isBlank());

    }
}
