public class TestThrow1 {
    private static void isVoter(int age){
        if (age<18)
            throw new ArithmeticException("INVALID!!");
        else
            System.out.println("He is Voter!!");
    }
    public static void main(String[] args) {
        isVoter(18);
        isVoter(15);
        System.out.println("End of the code!!");
    }
}
