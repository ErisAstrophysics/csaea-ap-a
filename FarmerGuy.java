public class FarmerGuy {
    
    // Attributes
    private String farmerName;
    private String gender;
    private String cropType;
    private int age;
    private String location;
    private int energyLevel;
    private boolean isHungry;
    private int cropsHarvested;
    private String season;
    int pitchforksEarned;
    private double money;
    int farmVehiclesOwned;

    // Constructor
    public FarmerGuy(String farmerName, String cropType, String gender){
        this.farmerName = farmerName;
        this.cropType = cropType;
        this.gender = gender;

        energyLevel = 100;
        cropsHarvested = 0;
        pitchforksEarned = 0;
        money = 100;
    }

    public void energy() {
        if (energyLevel < 0){
            energyLevel = 0;
        }
        if (energyLevel > 100){
            energyLevel = 100;
        }
    }
   
    public void harvestcrops() {
        cropsHarvested += 15;
        energyLevel -= 10;
    }

    public void sleep(int h = 0; h < 8; h++) {
        System.out.println(h + " hours slept.");
        energyLevel = 100;
    }
    
    public void birthday() {
        age += 1;
    }

    public void eat() {
        energyLevel += 10;
        isHungry = false;
    }

    public void buyvehicle() {
        farmVehiclesOwned += 1;
        money -= 50;
    }

    public void throwpicthfork() {
        pitchforksEarned -= 1;
        energyLevel -= 5;
        if (pitchforksEarned <= 0){
            System.out.println("You have no pitchsforks to throw.");
            pitchforksEarned = 0;
        }
        else {
            System.out.println("Pitchfork thrown.");
            pitchforksEarned -= 1;
        }
    }

    public void sellcrops() {
        money += 25;
    }

    public void season() {
        System.out.println("It is now: " + season);
    }

    public void checkbalance() {
        if (money < 0){
            System.out.println("Insufficient funds.");
            money = 0;
        }
        else {
            System.out.print("You have: " + money + " dollars.");
        }
    }







}
