package methods;

public class ToCharArray {
    public static void main(String[] args) {
        String str = "JAVA is best programming language.";
        char []chr = str.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            System.out.print(chr[i]);
        }
        System.out.println();



        String st = "ছোটবেলা থেকেই ওয়াজ মাহফিলগুলোতে শুনে আসছি ";
        for (char ch : st.toCharArray()) {
            System.out.println(ch);
        }
        System.out.println(st);
    }
}
