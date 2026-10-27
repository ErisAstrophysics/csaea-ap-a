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
        return address.substring(address.indexOf("."), -1);
    }

    public boolean isSchool() {
        return false;
    }





}
