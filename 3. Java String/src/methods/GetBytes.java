package methods;

public class GetBytes {
    public static void main(String[] args) {
        String st = "ABCDEabcde";

        for (byte bt : st.getBytes()) {
            System.out.println(bt);
        }
    }
}
