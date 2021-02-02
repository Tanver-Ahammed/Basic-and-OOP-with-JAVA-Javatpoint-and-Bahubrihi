package basic;

public class StringConcatenation {
    public static void main(String[] args) {
        System.out.println("Tanver"+" Ahammed");
        System.out.println("Tanver".concat(" Ahammed"));

        String s = 50+30+"Tanver"+20+80;
        System.out.println(s);

        String st = (new StringBuilder().append("Tanver ").append("Ahammed.").toString());
        System.out.println(st);
    }
}
