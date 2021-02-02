package methods;

public class Intern {
    public static void main(String[] args) {
        String s1 = "Hello JAVA";
        String s2 = new String("Hello JAVA");
        String s3 = s2.intern();

        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
