package methods;

public class ValueOf {
    public static void main(String[] args) {
        int intValue = 12345;
        float floatValue = 25.32654f;
        double doubleValue = 5464.454;
        boolean flag = false;
        long longValue = 164644451;
        short shortValue = 123;
        char charValue = 'a';
        byte byteValue = 120;

        System.out.println(String.valueOf(intValue));
        System.out.println(String.valueOf(floatValue));
        System.out.println(String.valueOf(doubleValue));
        System.out.println(String.valueOf(flag));
        System.out.println(String.valueOf(longValue));
        System.out.println(String.valueOf(shortValue));
        System.out.println(String.valueOf(charValue));
        System.out.println(String.valueOf(byteValue));
    }
}
