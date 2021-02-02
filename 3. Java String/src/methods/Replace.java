package methods;

public class Replace {
    public static void main(String[] args) {
        String st = "OAK is a programming language.OAK is developed by Oracle.";
        String replaceString = st.replace("OAK","JAVA");
        System.out.println(replaceString);


        String replaceString1 = st.replaceAll("OAK","JAVA");
        System.out.println(replaceString1);
    }
}
