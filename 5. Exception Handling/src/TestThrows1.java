import java.io.IOException;

public class TestThrows1 {
    private void m()throws IOException{
        throw new IOException("Device Error");
    }

    private void n()throws IOException{
        m();
    }

    private void p(){
        try {
            n();
        }catch (Exception e){
            System.out.println("Exception handled!!");
        }
    }

    public static void main(String[] args) {
        new TestThrows1().p();
        System.out.println("Normal flow....");
    }
}
