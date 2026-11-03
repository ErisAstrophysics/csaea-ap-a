public class RobotTester {
    public static void main(String[] args){

        //OBJECTS: a specific instance of a class
        //INSTANTIANATION: new object w/ a constructor call

        Robot r1 = new Robot("Rover", "RX-77-B", 8.0);
        Robot r2 = new Robot("Unit", "TK-21", 3.0);

        System.out.println(r1);

        //ALIASING: creating a "new" object, r3 is r1
        Robot r3 = r1;
        System.out.println(r3);

        r3.setName("Scout");
        System.out.println(r1.getName());

        //.equals checks if the value of the objects is the same
        System.out.println(r1.equals(r3));
        // == compares objects
        System.out.println(r1 == r3);

        String s1 = "RX-77-B";
        String s2 = new String("RX-77-B");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(r1.serialContains("77"));
        System.out.println(r1.serialContains("rx"));




    }
}
