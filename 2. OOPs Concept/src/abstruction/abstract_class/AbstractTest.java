package abstruction.abstract_class;

abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("drawing Circle");
    }
}
class Triangle extends Shape{

    @Override
    void draw() {
        System.out.println("drawing rectangle");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        Triangle triangle = new Triangle();
        triangle.draw();
    }
}
