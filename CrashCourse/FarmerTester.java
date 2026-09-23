public class FarmerTester{

    public static void main(String[] args) {

        FarmerGuy arthur = new FarmerGuy("Arthur", "Wheat", "Male");
        FarmerGuy bob = new FarmerGuy("Bob", "Corn", "Male");

        arthur.buyvehicle();
        bob.cropsharvested();
        arthur.birthday();
        bob.sellcrops();
        arthur.eat();
        



    }
}
