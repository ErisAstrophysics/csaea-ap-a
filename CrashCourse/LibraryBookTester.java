public class LibraryBookTester {
    
    public static void main(String[] args) {
        LibraryBook illuminae = new LibraryBook("Illuminae", "Amie Kaufman and Jay Kristoff", "Science Fiction", 599);
        LibraryBook outsiders = new LibraryBook("The Outsiders", "S.E. Hinton", "Fiction", 180);

        illuminae.checkOut();
        illuminae.bookLength();
        illuminae.whatGenre();
        illuminae.returnBook();
        illuminae.putOnHold();
        illuminae.returnHold();
        illuminae.markDamaged("Cover");
        illuminae.addRating(4.6);
        illuminae.viewRating();

        outsiders.checkOut();
        outsiders.bookLength();
        outsiders.whatGenre();
        outsiders.returnBook();
        outsiders.putOnHold();
        outsiders.checkOut();
        outsiders.returnHold();
        outsiders.checkOut();
        outsiders.markDamaged("Spine");
        outsiders.addRating(4.9);
        outsiders.viewRating();

  


    }
}
