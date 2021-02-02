package methods;

public class Split {
    public static void main(String[] args) {
        String st = "I want to be a JAVA Programmer.JAVA is best language.";

        for (String s : st.split(" ")) {
            System.out.println(s);
        }
        System.out.println();
        for (String s : st.split("JAVA")) {
            System.out.println(s);
        }



    }
}
