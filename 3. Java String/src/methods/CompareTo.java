package methods;

public class CompareTo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "MBSTU";
        String s4 = "ICT";
        String s5 = "Bangladesh";
        String st = "";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareTo(s5));

        System.out.println(st.compareTo(s1));
        System.out.println(s1.compareTo(st));


    }
}
