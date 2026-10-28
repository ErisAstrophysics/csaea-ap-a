public class Email {
    
    private String address;

    public Email(String address){
    this.address = address;
    }

    public String toString() {
        return address;
    }

    public int getAtIndex() { //where is the @?
        return address.indexOf("@");
    }

   //new method substring, cuts out part of a string

   //will return everything to the left of the @
    public String getUser() { 
        return address.substring(0,  address.indexOf("@"));
    }

    public String getDomain() {
        return address.substring(address.indexOf("@") + 1);
    }

    public boolean isSchool() {
        return address.indexOf("hcvsd.org") != -1;
    }

    // public String getFirstName() {
    //     return address.substring(address.indexOf(0, ));
    // }
    // ===== CHALLENGE 1 =====
// Method name: getFirstName
// School addresses are formatted first.last@hcvsd.org
// Return the first name: the part of the user before the ".".
//     "ana.lee@hcvsd.org" -> "ana"
// Hint: call getUser() first and store it in a variable.
// Hint: find the "." in that variable, not in address.
// Tools: getUser, indexOf, substring






}
