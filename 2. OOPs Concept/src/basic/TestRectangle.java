package basic;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(),r2 = new Rectangle();

        r1.insert(10,10);
        r2.insert(20,25);

        r1.calculationArea();
        r2.calculationArea();
    }
}
