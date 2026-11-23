import java.util.ArrayList;
public class ArrayListsTester {

    public static void main(String[] args){
        ArrayList<String> animals = ArrayLists.createlist();
        System.out.println(animals);

        ArrayLists.showIndex(animals);

        int index = ArrayLists.findIndex(animals, "penguin");
        System.out.println(index);

        ArrayLists.modifyAnimals(animals);

        ArrayLists.replaceAll(animals, "giraffe", "cat");
        System.out.println("Replaced Values ArrayList: " + animals);

        ArrayLists.numberUtilities();
        
        ArrayLists.membershipCheck(animals);

        ArrayLists.copyList();
        ArrayLists.removeAll(animals, "cat");


    }
}
