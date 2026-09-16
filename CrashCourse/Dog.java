public class Dog {
    
    // Attributes
    String name;
    String ownerName;
    String breed;
    int age;
    double weight;
    boolean isHungry;
    boolean isHome;
    int energyLevel;

    // Constructor
    public Dog(String name, String ownerName, String breed) {
        this.name = name;
        this.ownerName = ownerName;
        this.breed = breed;

        energyLevel = 75;
        weight = 35.4;
        isHungry = false;
        isHome = true;
        age = 3;
    }

    // Behaviors
    public void energy() {
        if (energyLevel > 100){
            energyLevel = 100;
        }
        if (energyLevel < 0){
            energyLevel = 0;
            isHungry = true;
        }
    }

    public void eat() {
        if (isHungry = true){
            isHungry = false;
            System.out.println("Your dog is full.");
            weight += 1;
        }
        else{
            System.out.println("Your dog is not hungry.");
        }
    }

    public void birthday() {
        age += 1;
        System.out.println("It's your dog's birthday!");
    }

    public void bark(){
        System.out.println("BARK");
    }

    public void scratch(){
        System.out.println("You've been scratched");
    }

    public void bite(){
        System.out.println("You've been bitten!");
    }

    public void runaway() {
        isHome = false;
        energyLevel -= 20;
    }

    public void comehome() {
        isHome = true;
        System.out.println("Your dog has come home!");
    }

    public void sleep() {
        energyLevel = 100;
    }





}
