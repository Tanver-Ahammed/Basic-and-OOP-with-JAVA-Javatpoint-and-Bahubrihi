package methods;

public class Contains {
    public static void main(String[] args) {
        String st = "now JAVA authorized by Oracle Corporation.";

        System.out.println(st.contains("Oracle"));
        System.out.println(st.contains("Oracl "));
        System.out.println(st.contains("JAVA"));
        System.out.println(st.contains("Kava"));

        if (st.contains("JAVA"))
            System.out.println("This Topic is about JAVA programming Language");
        else
            System.out.println("Out of Topic");

    }
}
