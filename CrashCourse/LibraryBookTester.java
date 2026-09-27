public class LibraryBookTester {
    
    public static void main(String[] args) {
        LibraryBook illuminae = new LibraryBook("Illuminae", "Amie Kaufman and Jay Kristoff", "Science Fiction", 599);
        LibraryBook outsiders = new LibraryBook("The Outsiders", "S.E. Hinton", "Fiction", 180);

        illuminae.checkOut();
        illuminae.bookLength();
        illuminae.whatGenre();
        illuminae.whoWroteThis();
        illuminae.putOnHold(); //should say that the book can't be placed on hold, due to it being checked out.
        illuminae.returnBook();
        illuminae.putOnHold();
        illuminae.returnHold();
        illuminae.markDamaged("Cover");
        illuminae.addRating(4.6);
        illuminae.viewRating();

        outsiders.checkOut();
        outsiders.bookLength();
        outsiders.whatGenre();
        outsiders.whoWroteThis();
        outsiders.returnBook();
        outsiders.putOnHold();
        outsiders.returnHold();
        outsiders.markDamaged("Spine");
        outsiders.addRating(4.9);
        outsiders.viewRating();

  


    }
}
