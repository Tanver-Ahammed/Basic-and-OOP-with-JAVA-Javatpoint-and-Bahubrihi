package abstruction.abstract_class;

abstract class Bank{
    abstract void rateOfInterest();
}
class BKDB extends Bank{
    @Override
    void rateOfInterest() {
        System.out.println("Rate of Interest is: 7%");
    }
}
class Prime extends Bank{
    @Override
    void rateOfInterest() {
        System.out.println("Rate of Interest is: 8%");
    }
}
class Islami extends Bank{
    @Override
    void rateOfInterest() {
        System.out.println("Rate of Interest is: No Interest");
    }
}
public class AbstractBank {
    public static void main(String[] args) {
        Bank bkdb = new BKDB();
        bkdb.rateOfInterest();

        Bank prime = new Prime();
        prime.rateOfInterest();

        Bank islami = new Islami();
        islami.rateOfInterest();





    }
}
