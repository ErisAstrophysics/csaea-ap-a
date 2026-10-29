public class Password {

    private String secret;

    public Password(String secret){
        this.secret = secret;
    }


    public boolean checkBroken(String attempt){
        return secret == attempt;
    }

    public boolean check(String attempt) {
        return secret.equals(attempt);
    }

        // ===== CHALLENGE 1  =====
    // create a method called sameAs which takes in a string 'other'. 
    // Return true if THIS Password and other have the same secret.
    // (Inside the class you can reach other.secret.)
    // to test, create a new object with a new password

    public boolean sameAs(String other) {
        return secret.equals(other);
    }

         // Create another method called "change()" two arguements, 
    // Change the password. The user must type the new password twice.
    // Change secret and return true ONLY if:
    //     both typed passwords match each other, AND
    //     the new password is different from the current one.
    // Otherwise change nothing and return false.
    //     secret "lion": change("tiger", "tiger") -> true   (secret is now "tiger")
    //     secret "lion": change("tiger", "tigre") -> false  (typo)
    //     secret "lion": change("lion", "lion")   -> false  (same as old)
    // Tools: equals, if/else, &&, !

    public String change(String newPassword) {
        return 
    }

}
