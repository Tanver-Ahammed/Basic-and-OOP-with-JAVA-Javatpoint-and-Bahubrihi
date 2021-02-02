package methods;

public class IndexOf {
    public static void main(String[] args) {
        String st = "I want to be a JAVA Programmer.JAVA is best language.";


        int index1 = st.indexOf('I');
        System.out.println(index1);

        int index2 = st.indexOf("JAVA");
        System.out.println(index2);

        int index3 = st.indexOf("JAVA",16);
        System.out.println(index3);

    }
}
