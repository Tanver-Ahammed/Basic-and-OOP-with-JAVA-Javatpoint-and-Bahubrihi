import java.io.IOException;

public class TestThrows2 {
    private void method() throws IOException {
        System.out.println("This is IOException");
    }
    public static void main(String[] args) throws IOException {
            new TestThrows2().method();
        System.out.println("Normal flowing.....");
    }
}
