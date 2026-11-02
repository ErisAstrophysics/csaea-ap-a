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
        spaceLeft = numPockets * 250;
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

    public boolean sameColor(String otherPack) {
        return colors.equals(otherPack);
    }

    public void addBooks() {
        numBooks += 1;
        System.out.println("You have added one book to your backpack. You now have: " + numBooks + " book(s) in your backpack.");
        spaceLeft -= 60;
        System.out.println("You have: " + spaceLeft + " cubic inches of space left in your backpack.");
    }

    public void putOnBag() {
        if(isWorn == false) {
            System.out.println("You have put on your backpack.");
            isWorn = true;
        }
        else{
            System.out.println("You are already wearing your backpack.");
        }
    }

    



}
