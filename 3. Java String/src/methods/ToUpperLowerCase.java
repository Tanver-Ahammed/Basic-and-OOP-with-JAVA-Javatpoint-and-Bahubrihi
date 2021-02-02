package methods;

import java.util.Locale;

public class ToUpperLowerCase {
    public static void main(String[] args) {
        String st1 = "JAVA IS OOP LANGUAGE.";
        String st2 = "c is not oop language.";
        String st3 = "C++ is MixEd LANguage.";

        String s1,s2,s3,s4;

        s1 = st1.toLowerCase();
        s2=st2.toUpperCase();
        s3=st3.toLowerCase(Locale.forLanguageTag("LAN"));
        s4=st3.toUpperCase();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
