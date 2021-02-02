public class CommonScenariosOfException {
    public static void main(String[] args) {
        int n = 10, a = 0,result = 0;
        String st = null;

        try {
            result = n/a; //ArithmeticException:/ by zero
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e);
        }

        try {
            result=st.length(); // NullPointerException
            System.out.println(result);
        }catch (NullPointerException e){
            System.out.println(e);
        }

        try {
            result = Integer.parseInt(st); // NumberFormatException
            System.out.println(result);
        }catch (NumberFormatException e){
            System.out.println(e);
        }

        try {
            int []arr = {1,2,3,4,5};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        try {
            st = "Tanver";
            System.out.println(st.charAt(8)); // StringIndexOutOfBoundsException
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("This is Last Line of code!!");

    }
}
