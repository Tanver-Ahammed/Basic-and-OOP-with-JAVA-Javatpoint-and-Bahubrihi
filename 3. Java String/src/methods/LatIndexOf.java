package methods;

public class LatIndexOf {
    public static void main(String[] args) {
        String st = "I want to be a JAVA Programmer.JAVA is best language.";

        int index1 = st.lastIndexOf('I');
        System.out.println(index1);

        int index2 = st.lastIndexOf("JAVA");
        System.out.println(index2);

        int index3 = st.lastIndexOf("JAVA",16);
        System.out.println(index3);
    }
}
