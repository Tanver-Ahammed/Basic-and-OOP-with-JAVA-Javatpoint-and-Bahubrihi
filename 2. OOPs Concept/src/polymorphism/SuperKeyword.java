package polymorphism;

class Animal {
    String color;
    String weight;
    String sound;

    public Animal(String color, String weight, String sound) {
        System.out.println("calling Animal constructor no: 1");
        this.color = color;
        this.weight = weight;
        this.sound = sound;
    }

    public Animal(Animal animal) {
        System.out.println("calling Animal constructor no: 2");
        this.color = animal.color;
        this.weight = animal.weight;
        this.sound = animal.sound;
    }

    public Animal() {
        System.out.println("calling Animal constructor no: 3");
        this.color = "Red";
        this.weight = "200 kg";
        this.sound = "making sound";
    }
    public void makeSound(){
        System.out.println(this.sound);
    }
}
class Horse extends Animal {
    String topSpeed;

    public Horse(String color, String weight, String sound, String topSpeed) {
        super(color, weight, sound);
        this.topSpeed = topSpeed;
    }

    public Horse(Animal animal, String topSpeed) {
        super(animal);
        this.topSpeed = topSpeed;
    }

    public Horse() {
        super();
        this.topSpeed="123km";
    }

    public void showTopSpeed(){
        System.out.println(topSpeed);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", sound='" + sound + '\'' +
                ", topSpeed='" + topSpeed + '\'' +
                '}';
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Horse h1 = new Horse("Brown","300kg","Hessa","123kmph");
        Horse h2 = new Horse(h1,"125km");
        Horse h3 = new Horse();

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}
