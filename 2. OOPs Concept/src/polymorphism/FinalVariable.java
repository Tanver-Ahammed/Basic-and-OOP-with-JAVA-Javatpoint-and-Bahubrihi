package polymorphism;

public class FinalVariable {
    final float PI_Value=3.1416f;
    private void areaOfCircle(float radius){
        System.out.println(PI_Value*radius*radius);
    }

    public static void main(String[] args) {
        System.out.println(new FinalVariable().PI_Value);
        new FinalVariable().areaOfCircle(2);

    }
}
