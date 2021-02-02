import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter regex pattern: ");
            Pattern pattern = Pattern.compile(scanner.nextLine(),Pattern.CASE_INSENSITIVE);
            System.out.print("Enter Text: ");
            Matcher matcher = pattern.matcher(scanner.nextLine());
            boolean matchFound = false;
            while (matcher.find()) {
                System.out.println("I found the text " + matcher.group() + " starting at index " +
                        matcher.start() + " and ending at index " + matcher.end());
                matchFound = true;
            }
            if (!matchFound)
                System.out.println("No Match Found!!");

        }
    }
}
