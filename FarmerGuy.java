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
    int acresLand;

    // Constructor
    public FarmerGuy(String farmerName, String cropType, String gender){
        this.farmerName = farmerName;
        this.cropType = cropType;
        this.gender = gender;

        energyLevel = 100;
        cropsHarvested = 0;
        pitchforksEarned = 0;
        
    }







}
