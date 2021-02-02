package basic;

public class StringComparison {
    public static void main(String[] args) {
        // by equals() method
        String st1 = "Tanver";
        String st2 = "Tanver";
        String st3 = new String("Tanver");
        String st4 = "Ahammed";

        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));
        System.out.println(st1.equals(st4));

        System.out.println(st1.equalsIgnoreCase("tanver"));

        System.out.println(st1 == st2);
        System.out.println(st1 == st3);

        //by compareTo() method
        String s1,s2,s3;
        s1 = "Tanver";
        s2 = "tanver.";
        s3 = "ICT";

        System.out.println("a".compareTo("A"));
        System.out.println(s3.compareToIgnoreCase("ict"));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s2));

        String m="";
        System.out.println("uyg"+m);
    }
}
