public class BackpackTester {
    public static void main(String[] args){

        Backpack one = new Backpack("black, red", 5);
        Backpack two = new Backpack("green, yellow", 6);
        Backpack three = new Backpack("purple, blue", 3);

        System.out.println(one.toString()); //should say that the colors of the bag are black, red
        System.out.println(one.mainColor()); //should say that the main color is black
        System.out.println(one.hasGreen()); //should be false
        one.addBooks(); //should say that their is 1 book in the bag, and there is less space in the bag
        one.putOnBag(); //should say that you put the bag on
        one.putOnBag(); //should say that your already wearing the bag

        System.out.println(two.toString()); //should say that the colors are green, yellow
        System.out.println(two.mainColor()); //should say green
        System.out.println(two.hasGreen()); //should be true

        System.out.println(three.toString()); //should say purple, blue
        System.out.println(three.mainColor()); //should say purple
        System.out.println(three.hasGreen()); //should be false

        String four = new String("black, red");
        System.out.println(one.sameColor(four)); //should be true
        String five = new String("pink, cyan");
        System.out.println(one.sameColor(five)); //should be false






    }
}
