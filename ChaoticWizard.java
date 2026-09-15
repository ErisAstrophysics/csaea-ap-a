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






}
