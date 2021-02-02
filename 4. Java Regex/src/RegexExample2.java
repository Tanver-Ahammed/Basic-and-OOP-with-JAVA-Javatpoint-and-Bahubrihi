import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 {
    public static void main(String[] args) {
        Pattern pt = Pattern.compile("Tanver",Pattern.CASE_INSENSITIVE);
        Matcher mc = pt.matcher("I am Tanver Ahammed Aminul Bari.I am a student of MBSTU");
        boolean matchFound = mc.find();

        if (matchFound)
            System.out.println("Match Found!!");
        else
            System.out.println("Match does not Found!!");
    }
}
