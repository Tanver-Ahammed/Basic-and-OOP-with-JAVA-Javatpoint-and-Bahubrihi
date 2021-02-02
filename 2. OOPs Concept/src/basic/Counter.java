package basic;

public class Counter {
    int nonStaticCount = 0;
    static int staticCount = 0;

    private Counter() {
        nonStaticCount++;
        staticCount++;
        System.out.println("Non Static count: "+nonStaticCount+" Static count: "+staticCount);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();
    }
}