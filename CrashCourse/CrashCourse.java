import java.util.ArrayList;

public class CrashCourse {     // class header

    public static void main(String[] args) {

        // comments 
        
        /*  Multiline 
         Comment
         Here
         */

         System.out.print("Hello");
         System.out.println("World"); //auto prints on a new line
         System.out.println("Hello World"); 

         //variable declaration
         //PRIMITIVE VARIABLES
         int a;     //integer
         double b;  //decimal, or float
         boolean c; //True or False

         a = 4;
         b = 5.5;
         c = false; //lowercase

         // Arthimetic Operators
         // + - * /
         // += -= /= %=, modulus gives you the remainder

         int d = 3;
         d += 7; // adds 7 to d, then reassigns d to be 7

         System.out.println("d = " + d); // putting spaces between + and d concatonates

         //increment and decrement by 1
         // -- ++
         d--;
         d++;
         d++;
         System.out.println("d is now equal to: " + d);

         //COMPARISONS (always returns true or false)
         // < > <= >= == !=
         System.out.println(4 < 5);
         System.out.println(7 == 4);
         System.out.println(1 != 2);

         // LOGICAL OPERATORS
         // In order of precedence: ! (not)  && (and)  || (or)

        boolean f = false; boolean t = true;

        // predict output: true or false? 
        System.out.println(!f);  //true
        System.out.println(f && t);// false
        System.out.println(f || t); //true
        System.out.println(f || t && !f); // true

        System.out.println(f && t); // short circuits to FALSE after checking f && -- java does not need to check t.
        System.out.println(t || (f && t)); //short circuits after checking the first t.

        //CASTING (converting)
        int g = (int)5.5;
        System.out.println(g);
        double h = (double)5/6;
        System.out.println(h);

        //STRINGS
        String s1 = "Goodnight";
        String s2 = " and ";
        String s3 = "Goodbye";
        String result = s1 + s2 + s3;
        result += ", Cowboy.";
        System.out.println(result + "\n");

        //ARRAYS
        int[] arry1 = new int[10];
        System.out.println(arry1);
        System.out.println("length: " + arry1.length);

        arry1[0] = 11; //makes an array of 11 zeroes
        arry1[1] = 2; //makes an array of 2 ones

        System.out.println("Remainder: " + arry1[0] % arry1[1]);

        int[] arry2 = {34, 52, 3, 64, 32};
        System.out.println("arry2: " + arry2);

        //2D ARRAYS (grid or table)

        int[][] arryGrid1 = new int[4][3]; //[rows] by [columns]
        // 0 0 0
        // 0 0 0
        // 0 0 0
        // 0 0 0

        System.out.println("Rows: " + arryGrid1.length);
        System.out.println("Columns: " + arryGrid1[0].length); //tells you how many elements are in the first row [0 0 0], which is the number of columns

        int[][] arryGrid2 = { {7, 8, 9}, 
                              {4, 5, 6}, 
                              {1, 2, 3} };
        
        System.out.println(arryGrid2[0][1]); //access number 8, row 0, column 1
        System.out.println(arryGrid2 [2][2]); //access number 3, row 2, column 2

        //ARRAYLISTS
        //Can be any size. Lots of built in functions to help
        //Avoid primitive data types. Special classes for Integer, Double,, Boolean, and String, called "wrapper classes"

        ArrayList<String> arryLst = new ArrayList<>();

        arryLst.add("Word 1");
        arryLst.add("Word 2");
        arryLst.add("Word 3");
        arryLst.remove(0);
        arryLst.add(0, "Word 4");
        arryLst.set(2, "Word 5");
        System.out.println(arryLst.size());
        System.out.println(arryLst.get(2));

        System.out.println(arryLst);




    }
}