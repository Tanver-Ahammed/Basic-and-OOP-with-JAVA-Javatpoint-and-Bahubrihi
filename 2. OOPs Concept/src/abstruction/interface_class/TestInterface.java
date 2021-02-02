package abstruction.interface_class;

interface Bank{
    float rateOfInterest();
}
class BKDB implements Bank{

    @Override
    public float rateOfInterest() {
        return 8.50f;
    }
}
class Prime implements Bank{

    @Override
    public float rateOfInterest() {
        return 10.50f;
    }
}
public class TestInterface {
    public static void main(String[] args) {
        Bank prime = new Prime();
        System.out.println(prime.rateOfInterest());

        Bank bkdb = new BKDB();
        System.out.println(bkdb.rateOfInterest());


    }
}
