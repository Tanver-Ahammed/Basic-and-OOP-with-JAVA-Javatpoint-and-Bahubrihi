public class MultiCatchBlock2 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            System.out.println(a[10]);
        }catch (NumberFormatException | ArithmeticException |NullPointerException | ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
