package abstruction.abstract_class;

abstract class Cake{
    String cakeFlavor="";

    //abstract method create
    abstract void addFlavor(String cakeFlavor);

    //concrete method
    void bakeCake(){
        System.out.println("Baking "+this.cakeFlavor +" flavored cake");
    }
}

class ChocolateCake extends Cake{
    @Override
    void addFlavor(String cakeFlavor) {
        System.out.println("Implementing abstract class method as a concrete method");
        this.cakeFlavor=cakeFlavor;
    }
}

class VanillaCake extends Cake{

    @Override
    void addFlavor(String cakeFlavor) {
        System.out.println("Implementing abstract class method as a concrete method");
        this.cakeFlavor=cakeFlavor;
    }
}

public class Abstract {
    public static void main(String[] args) {
        ChocolateCake chocolateCake = new ChocolateCake();
        chocolateCake.addFlavor("Chocolate Caramel");
        chocolateCake.bakeCake();
        System.out.println(chocolateCake.cakeFlavor);

        VanillaCake vanillaCake = new VanillaCake();
        vanillaCake.addFlavor("vanilla with nuts");
        vanillaCake.bakeCake();

        Cake cake = new Cake() {
            @Override
            void addFlavor(String cakeFlavor) {
                System.out.println("overridden abstract method!!");
                this.cakeFlavor=cakeFlavor;
            }
        };
        cake.addFlavor("Hazelnut");
        cake.bakeCake();
    }
}
