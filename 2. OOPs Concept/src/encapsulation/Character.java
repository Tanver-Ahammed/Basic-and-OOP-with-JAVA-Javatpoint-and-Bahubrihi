package encapsulation;

public class Character {
    private String name;
    private String gander;
    private String ability;
    private int strength;
    private int health;

    public Character(String name, String gander, String ability, int strength, int health) {
        System.out.println("constructor-1 is being called!!");
        this.name = name;
        this.gander = gander;
        this.ability = ability;
        this.strength = strength;
        this.health = health;
    }

    public Character(String name, String ability) {
        System.out.println("constructor-2 is being called!!");
        this.name = name;
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Character() {
        System.out.println("constructor-3 is being called!!");
    }

    public void useAbility(){
        System.out.println(name+" is "+ability);
    }

    public void useAbility(String specialAbility){
        System.out.println(name+" is "+specialAbility);
    }

    public void attack(){
        System.out.println(name+" is moving Attacked!!");
    }

    public void moveAhead(){
        System.out.println(name+" is moving ahead!!");
    }

    public void moveRight(){
        System.out.println(name+" is moving Right!!");
    }

    public void moveLeft(){
        System.out.println(name+" is am moving Left!!");
    }

    public void defend() {
        System.out.println(name+" is moving Defend!!");
    }

    public static void main(String[] args) {
        Character charly = new Character("Charly", "Male", "Flying", 100, 210);
        Character spidy = new Character("Spidy", "Crowing");
        Character harry = new Character();

        charly.useAbility();
        spidy.useAbility("kicking");
    }



}
