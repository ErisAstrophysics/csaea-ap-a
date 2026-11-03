// CLASS: blueprint / template that CREATE objects. It stores methods/functions and data, etc. 
// CLASS HEADER
public class Robot {
    
    //ATTRIBUTES / DATA: private instance variables
    private String name;
    private String serial;
    private double battery;
    private boolean isOn;

    //CONSTRUCTOR: special method, starting point for new objects
    public Robot(String name, String serial, double battery){ //PARAMETERS go in the ()
        
        //THIS seperates the instance variables from the parameters
        this.name = name;
        this.serial = serial;
        this.battery = battery;

        //DEFAULT STATE: every object starts off with this
        isOn = false;
    }

    //GETTER / ACCESSOR: return type has to match the variable
    public String getName() {
        return name;
    }

    public double getBattery() {
        return battery;
    }

    public boolean isOn() {
        return isOn;
    }

    //SETTER / MUTATORS: always have "void", PARAMETER which receives an ARGUMENT
    public void setName(String newName) {
        name = newName;
    }

    public String toString() {
        return name + " [" + serial + "]";
    }

    // indexOf: returns index, or -1 if not found
     public boolean serialContains(String part) {
            return serial.indexOf(part) != -1;
    }





}
