import java.util.ArrayList;
public class ArrayLists {

    public static ArrayList<String> createlist() {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("donkey");
        animals.add("penguin");
        animals.add("giraffe");
        
        return animals;
    }

    public static void showIndex(ArrayList<String> animals) {
        System.out.println("First element: " + animals.get(0));
        System.out.println("Second element: " + animals.get(1));
        System.out.println("Last element: " + animals.get(animals.size() - 1));

    }

    public static int findIndex(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals(target)){
                return i;
            }
        }
        return -1;
    }


}
