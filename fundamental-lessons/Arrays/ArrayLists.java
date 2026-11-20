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

    public static void modifyAnimals(ArrayList<String> animals) {
        animals.set(0, "horse"); //replaces the element at this index
        animals.add("glass frog"); //appends to the end of the list
        animals.add(3, "aye-aye"); //adds to that index, shifts everything after to the right

        String removed = animals.remove(0);
        System.out.println("Modified Animals ArrayList: " + animals);

    }

    // * ===== CHECKPOINT 1: Searching and Modifying =====
//      * CHALLENGE:
//      * Write replaceAll(ArrayList<String> list, String oldVal, String newVal) that replaces
//      * EVERY match, not just the first.
//      * Example: ["cat", "dog", "cat"], replace "cat" with "fox"  ->  [fox, dog, fox]
//      * Tools:   for loop with index i, size(), get(i), set(i, obj), .equals()
    public static void replaceAll(ArrayList<String> list, String oldVal, String newVal){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals(oldVal)){
                list.set(i, newVal);
            }
        }
    }

    public static void numberUtilities() {
        //Native array list
        int[] values = {3, 7, 1,9, 4, 2, 5, 8, 6, 0};
        //ArrayList
        ArrayList<Integer>  nums = new ArrayList<Integer>();

        for (int v  : values) {
            nums.add(v); //autoboxing
        }

        System.out.println("Original Numbers: " + nums);
        System.out.println("Length of List: " + nums.size());

        int min = nums.get(0);
        int max = nums.get(0);
        int sum = 0;

        //enhanced for loop, good for reading, not for adding/replacing
        for (int n : nums) {
            if (n < min) min = n; //doesn't need to be on seperate lines w/ {}
            if (n > max) max = n;
            sum += n; //accumulator pattern, will add every number in nums together
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);

        //finds the average number as a double of nums
        System.out.println("Average: " + (double) sum / nums.size()); //putting double in () casts it onto sum, making sum a double

        // for (int i = 0; i < nums.size(); i++){
        //     if 
        // }

    }

        /* ===== CHECKPOINT 2: Traversal Algorithms =====
     * CHALLENGE:
     * Find the INDEX of the max, not just its value. (Why can't you use an enhanced for loop?)
     * Example: [3, 7, 1, 9, 4]  ->  3   (the 9 is at index 3)
     * Tools:   for loop with index i, size(), get(i), a variable to remember the best index
     * */

 







}
