package methods;

public class Concat {
    public static void main(String[] args) {
        String s1 = "JAVA is ";
        s1.concat("best programming language");
        System.out.println(s1);

        s1=s1.concat("best programming language");
        System.out.println(s1);

        String st1,st2,st3,st4;
        st1="JAVA";
        st2="is created";
        st3="by James Gosling.";

        st4=st1.concat(" ").concat(st2).concat(" ").concat(st3);
        System.out.println(st4);
    }
}
