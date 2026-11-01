public class Backpack {
    
    private String color;
    private int numPockets;
    private int numBooks;
    private double spaceLeft;
    private boolean isWorn;

    public Backpack(String color, int numPockets){
        this.color = color;
        this.numPockets = numPockets;

        numBooks = 0;
        spaceLeft = 1500;
        isWorn = false;
    }

    public String toString() {
        return "The color of this backpack is " + color;
    }

    



}
