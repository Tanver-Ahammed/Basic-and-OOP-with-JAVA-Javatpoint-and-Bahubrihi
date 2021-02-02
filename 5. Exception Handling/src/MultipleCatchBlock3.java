public class MultipleCatchBlock3 {
    public static void main(String[] args) {
        try {
            String st = null;
            System.out.println(st.length());
        }catch (ArithmeticException e){
            System.out.println("This is Arithmetic Exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This is Arithmetic Exception");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("This is ArrayIndexOutOfBounds Exception");
        }catch (NumberFormatException e){
            System.out.println("This is NumberFormat Exception");
        }catch (Exception e){
            System.out.println("This is parent Exception");
        }
        System.out.println("Last line of the code");
    }
}
