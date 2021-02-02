package methods;

public class CharAt {
    public static void main(String[] args) {
        String name = "Md. Tanver Ahammed";
        try {
            for (int i = 0; i < name.length(); i++) {
                System.out.println(name.charAt(i));
            }
            System.out.println(name.charAt(19));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("The Exception is: " + e);
        }
        for (char ch : name.toCharArray()) {
            System.out.println(ch);
        }
    }
}