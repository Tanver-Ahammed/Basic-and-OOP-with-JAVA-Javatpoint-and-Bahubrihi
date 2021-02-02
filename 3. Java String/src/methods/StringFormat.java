package methods;

public class StringFormat {
    public static void main(String[] args) {
        int intVal = 2550;
        float floatVal = 25.3255f;
        double doubleValue = 256.355465;
        char ch = 'a';
        boolean flag = true;
        byte byteVal = 110;
        short shortVal = 120;
        long longVal = 146546545;
        String st = "This is JAVA code.";

        System.out.printf("%b\n",!flag);
        System.out.printf("%c\n",ch);
        System.out.printf("%d\n",intVal);
        System.out.printf("%e\n",floatVal);
        System.out.printf("%o\n",12549);
        System.out.printf("%s\n",st);

        System.out.println("\nString.format()");
        String s1 = String.format("%d",intVal);
        System.out.println(s1);
        String s2 = String.format("%f",floatVal);
        System.out.println(s2);
        String s3 = String.format("%f",doubleValue);
        System.out.println(s3);
        String s4 = String.format("%c",ch);
        System.out.println(s4);
        String s5 = String.format("%d",byteVal);
        System.out.println(s5);

        String s6 = String.format("%d",shortVal);
        System.out.println(s6);
        String s7 = String.format("%d",longVal);
        System.out.println(s7);
        String s8 = String.format("%s",st);
        System.out.println(s8);




    }
}
