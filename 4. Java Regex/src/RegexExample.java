import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        // first way
        Pattern pt = Pattern.compile("Tanver");
        Matcher m = pt.matcher("Tanver");
        boolean b1 = m.matches();
        System.out.println(b1);

        // second way
        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        System.out.println(b2);

        // third way
        boolean b3 = Pattern.matches(".s","as");
        System.out.println(b3);

        boolean b4 = m.find();
        System.out.println(b4);
    }
}
