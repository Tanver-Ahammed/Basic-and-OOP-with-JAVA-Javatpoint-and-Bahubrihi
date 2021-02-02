package controlStatement;

public class SwitchEnumExample {
    private enum Day {Sat, Sun, Mon, Tue, Wed, Thu, Fri}

    public static void main(String[] args) {
        Day[] DayNow = Day.values();
        for (Day now : DayNow) {
            switch (now) {
                case Sat -> System.out.println("Saturday");
                case Sun -> System.out.println("Sunday");
                case Mon -> System.out.println("Monday");
                case Tue -> System.out.println("Tuesday");
                case Wed -> System.out.println("Wednesday");
                case Thu -> System.out.println("Thursday");
                case Fri -> System.out.println("Friday");
            }
        }
    }
}
