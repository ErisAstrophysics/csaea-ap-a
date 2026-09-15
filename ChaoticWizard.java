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

    public void takeDamage(){
        
    }

    public void forageingredients() {
        energyLevel -= 10;
        System.out.println("You've found spell ingredients!");
    }

    public void foragescrolls() {
        energyLevel -= 10;
        System.out.println("You've found a spell scroll!")
        spellsLearned += 1;
    }

    public void sleep() {
        health = 100;
        energyLevel = 100;
    }

    public void spellperform() {
        beardLength += 1.5;
        
    }







}
