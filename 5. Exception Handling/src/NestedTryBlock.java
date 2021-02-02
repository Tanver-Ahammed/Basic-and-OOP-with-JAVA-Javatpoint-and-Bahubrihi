public class NestedTryBlock {
    public static void main(String[] args) {
        try {

            try {
                System.out.println(30/0);
            }catch (ArithmeticException e){
                System.out.println(e);
            }

            try {
                String st = null;
                System.out.println(st.length());
            }catch (NullPointerException e){
                System.out.println(e);
            }
            System.out.println("Tanver");


        }catch (Exception e){
            System.out.println("All the Exception is handled!!");
        }
        System.out.println("End of the code!!");

    }
}