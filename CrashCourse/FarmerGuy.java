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
    private int pitchforksEarned;
    private double money;
    private int farmVehiclesOwned;


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
   
    public void cropsharvested() {
        cropsHarvested += 15;
        energyLevel -= 10;
        System.out.println("Crops Harvested");
    }

    public void sleep() {
        energyLevel = 100;
        System.out.println("Energy = 100");
    }
    
    public void birthday() {
        age = age + 1;
        System.out.println("You've Aged");
    }

    public void eat() {
        energyLevel += 10;
        isHungry = false;
        System.out.println("You are now full");
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
