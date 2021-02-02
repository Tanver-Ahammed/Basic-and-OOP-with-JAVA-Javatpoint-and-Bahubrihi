package basic;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        // append()
        sb.append("Tanver");
        sb.append(" Ahammed ");
        System.out.println(sb);

        // insert()
        sb.insert(15,"Bari");
        System.out.println(sb);

        // replace()
        sb.replace(14,19," Aminul");
        System.out.println(sb);

        // delete()
        sb.delete(14,21);
        System.out.println(sb);

        // capacity()
        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.delete(0,20);
        System.out.println(sb);
        System.out.println(sb.capacity());


    }
}
