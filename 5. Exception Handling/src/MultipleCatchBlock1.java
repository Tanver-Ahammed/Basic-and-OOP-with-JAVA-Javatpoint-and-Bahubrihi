public class MultipleCatchBlock1 {
    public static void main(String[] args) {

        try {
            int[] a = new int[4];
            a[5] = 30 / 0;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("End of the code!!");
    }
}
