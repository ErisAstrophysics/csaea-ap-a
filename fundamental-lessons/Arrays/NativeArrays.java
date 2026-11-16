import java.util.Arrays;
public class NativeArrays{
    public static void main(String[] args){

        int[] scores = new int[5];
        System.out.println("Default values: " + Arrays.toString(scores));

        int[] nums = {3, 7, 1, 9, 4};
        System.out.println("Initializer List: " + Arrays.toString(nums));

        String[] names = new String[3];
        boolean[] flags = new boolean[3];
        double[] prices = new double[3];

        System.out.println("String defaults:  " + Arrays.toString(names));
        System.out.println("boolean defaults: " + Arrays.toString(flags));
        System.out.println("double defaults:  " + Arrays.toString(prices));

        //INDEXES AND LENGTH
        // Indexes start at 0. The last index is length - 1.
        System.out.println("\nFirst element nums[0]: " + nums[0]);
        System.out.println("Length (a field, no parentheses): " + nums.length);
        System.out.println("Last element nums[nums.length - 1]: " + nums[nums.length - 1]);

        nums[2] = 6;

        //OUT OF BOUNDS error
        //System.out.println(nums[5]);
        //System.out.println(nums[-1]);

        //PARTS OF A FOR LOOP
        //gives indexes and values
        for (int i = 0; i < nums.length; i++){
            System.out.println("index" + i + " -> value " + nums[i]);
        }

        //ENHANCED FOR LOOP, just gives values
        for (int value : nums){
            System.out.println("Enhanced Value " + value);
        }

        // Challenge 1: Double It
        // Multiply every element by 2, then print the array.
        int[] challengeOne = {3, 7, 1, 9, 4};
        // TODO: your loop here
        for (int i = 0; i < challengeOne.length; i++){
            System.out.println("Index" + i + " -> value " + challengeOne[i] * 2);
        }

        // Challenge 2: Every Other
        // Use i += 2 to add 10 to only the elements at even indexes, then print.
        int[] challengeTwo = {3, 7, 1, 9, 4};
        // TODO: your loop here
        for(int i = 0; i < challengeTwo.length; i += 2){
            System.out.println("index " + i + " -> value " + challengeTwo[i]);
        }

        // Challenge 3: Replace Negatives
        // Change every negative number to 0, then print.
        int[] temps = {5, -3, 8, -1, 0, -7};
        // TODO: your loop here
        // HINTS: use an if statement in each pass of the loop
        // redefine element value like this: nums[2] = 6;

        for (int i = 0; i < temps.length; i++){
            System.out.println("index " + i + " -> value " + temps[i] * 0);
        }







    }
}
