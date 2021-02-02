package basic;

public class StringClass {
    public static void main(String[] args) {
        String st,st1,st2,st3;

        // toUpperCase() and toLowerCase()
        st1 = "TaNvERaHAmMED";
        st2 = "NAZMUN NAHAR NAJU";
        st3 = "md. abu talha";

        System.out.println(st1.toUpperCase());
        System.out.println(st1.toLowerCase());
        System.out.println(st2.toLowerCase());
        System.out.println(st3.toUpperCase());

        // trim()
        st = "   Tanver   ";
        System.out.println(st);
        System.out.println(st.trim());

        //  startsWith() and endsWith()
        System.out.println(st1.startsWith("Ta"));
        System.out.println(st2.endsWith("NAJU"));

        // charAt()
        System.out.println(st1.charAt(0));
        System.out.println(st1.charAt(2));
        System.out.println(st1.charAt(4));
        System.out.println(st1.charAt(7));

        // length()
        System.out.println(st.length());
        System.out.println(st.trim().length());

        // intern()
        String s = st.intern();
        System.out.println(s);

        // valueOf()
        int a=100;
        double l =25.5646;
        st = String.valueOf(a);
        s = String.valueOf(l);
        System.out.println(st);
        System.out.println(s);

        // replace()
        s = "Kava is a best programming language,Kava is best...";
        st = s.replace("Kava","Java");
        System.out.println(st);


    }
}
