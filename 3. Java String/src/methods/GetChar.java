package methods;

import java.util.ArrayList;

public class GetChar {
    public static void main(String[] args) {
        String st = "hello JAVA Coder to oracle,Google,Amazon";

        char[] ch = new char[10];
        try {

            st.getChars(6, 22, ch, 0);
            System.out.println(ch);
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
