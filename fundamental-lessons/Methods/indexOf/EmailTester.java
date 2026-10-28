public class EmailTester {  
    public static void main(String[] args) {

        String word = "banana";
        System.out.println(word.indexOf("b")); //0
        System.out.println(word.indexOf("a")); //1
        System.out.println(word.indexOf("nan")); //2
        System.out.println(word.indexOf("z")); //-1
        System.out.println(word.indexOf("B")); //-1


        Email michael = new Email("mharrell@nhvweb.net");
        Email jojo = new Email("jojo@nhvweb.net");

        System.out.println(michael.toString());

        System.out.println(michael.getAtIndex());
        System.out.println(jojo.getAtIndex());

        System.out.println(michael.getUser());
        System.out.println(jojo.getUser());

        System.out.println(michael.getDomain());
        System.out.println(jojo.getDomain());

        System.out.println(michael.getFirstName());


    }



}
