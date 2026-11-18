import java.util.ArrayList;
public class ArrayListsTester {

    public static void main(String[] args){
        ArrayList<String> animals = ArrayLists.createlist();
        System.out.println(animals);

        ArrayLists.showIndex(animals);

        int index = ArrayLists.findIndex(animals, "penguin");
        System.out.println(index);
    }
}
