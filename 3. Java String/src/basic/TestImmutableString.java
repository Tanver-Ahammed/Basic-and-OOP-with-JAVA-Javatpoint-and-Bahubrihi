package basic;

public class TestImmutableString {
    public static void main(String[] args) {
        String st = "Tanver";
        st.concat("Ahammed");
        //here string is not change
        System.out.println(st);

        //but we use
        st = st.concat(" Ahammed");
        System.out.println(st);
    }
}
