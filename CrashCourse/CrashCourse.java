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

         boolean e = false; boolean f = true; //can define multiple variables on one line

         //predict output: 
       
         System.out.println(!e); //True
         System.out.println(e && f); //false
         System.out.println(e || f); //true
         System.out.println(e || f && !e); //true

         System.out.println( e && f); //short circuts after checking e -- java does not need check f)







    }
}