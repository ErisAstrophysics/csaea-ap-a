public class ChaoticWizard {
    
    // Attributes
    String characterName;
    String gender;
    String staffType;
    int health;
    boolean isHungry;
    int energyLevel;
    int age;
    int intelligence;
    int spellsLearned;
    String location;
    double beardLength;
    int arrestWarrants;

    // Constructor
    public ChaoticWizard (String characterName, String gender, String staffType){
        this.characterName = characterName;
        this.gender = gender;
        this.staffType = staffType;

        health = 75;
        isHungry = false;
        energyLevel = 100;
        age = 85;
        spellsLearned = 1;
        beardLength = 0;
        arrestWarrants = 1;
    }

    // Behaviors
    public void attack(){
        energyLevel -= 20;
        System.out.println("You've hit the enemy!");
    }

    public void forageingredients() {
        energyLevel -= 10;
        System.out.println("You've found spell ingredients!");
    }

    public void foragescrolls() {
        energyLevel -= 10;
        System.out.println("You've found a spell scroll!");
        spellsLearned += 1;
    }

    public void sleep() {
        health = 100;
        energyLevel = 100;
    }

    public void spellperform() {
        beardLength += 1.5;
        System.out.println("You've performed a spell!");
    }

    public void eat() {
        energyLevel += 10;
        health += 10;
    }

    public void commitcrime() {
        energyLevel -= 20;
        arrestWarrants += 1;
    }

    public void birthday() {
        age += 1;
        System.out.println("Happy Birthday!");
    }

    public void location() {
        energyLevel -= 5;
        System.out.println("Moved Location");
    }

    public void study() {
        intelligence += 5;
        beardLength += 1.5;
    }

    public void jail() {
        arrestWarrants -= 1;
        intelligence -= 2;
    }

    public void energy() {
        if (energyLevel > 100){
            energyLevel = 100;
        }
        if (energyLevel < 0){
            energyLevel = 0;


        }
    }







}
