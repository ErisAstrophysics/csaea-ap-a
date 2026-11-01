public class Backpack {
    
    private String colors;
    private int numPockets;
    private int numBooks;
    private double spaceLeft;
    private boolean isWorn;

    public Backpack(String colors, int numPockets){
        this.colors = colors;
        this.numPockets = numPockets;

        numBooks = 0;
        spaceLeft = 1500;
        isWorn = false;
    }

    public String toString() {
        return "The colors of this backpack are: " + colors;
    }

    public String mainColor() {
        return "The main color of this backpack is: " + colors.substring(0, colors.indexOf(","));
    }

    public boolean hasGreen() {
        return colors.indexOf("green") != -1;
    }

    



}
