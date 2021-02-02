public class TestExceptionPropagation1 {
    private void exceptionMethod(){
        System.out.println(50/0);
    }

    private void intermediateMethod(){
        exceptionMethod();
    }
    private void display(){
        try {
            intermediateMethod();
        }catch (Exception e){
            System.out.println("The Exception is Handled!!");
        }
    }

    public static void main(String[] args) {
        TestExceptionPropagation1 obj = new TestExceptionPropagation1();
        obj.display();
        System.out.println("End Line of the code!!");
    }
}
