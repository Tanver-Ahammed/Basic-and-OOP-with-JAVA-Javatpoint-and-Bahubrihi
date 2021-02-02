package polymorphism;

class Shape {
    void draw() {
        System.out.println("drawing...");
    }
}
class Circle extends Shape{
    void draw() {
        System.out.println("drawing Circle...");
    }
}
class Rectangle extends Shape{
    void draw() {
        System.out.println("drawing Rectangle...");
    }
}
class Triangle extends Shape{
    void draw() {
        System.out.println("drawing Triangle...");
    }
}

public class ShowShape {
    public static void main(String[] args) {
        Shape s;
        s=new Circle();
        s.draw();

        s=new Rectangle();
        s.draw();

        s=new Triangle();
        s.draw();


    }
}
