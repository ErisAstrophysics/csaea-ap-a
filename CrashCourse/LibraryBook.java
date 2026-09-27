public class LibraryBook {
    
    //Attributes
    private String bookTitle;
    private String authorName;
    private String genre;   
    private boolean isCheckedOut;
    private boolean isDamaged;
    private int numberPages;
    private boolean isOnHold;
    private double bookRating;

    //Constructor
    public LibraryBook(String bookTitle, String authorName, String genre, int numberPages){
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.genre = genre;
        this.numberPages = numberPages;

        isCheckedOut = false;
        isDamaged = false;
        isOnHold = false;
        bookRating = 5.0;
    }

    //Methods
    public void checkOut(){
        if(isCheckedOut = false) {
            isCheckedOut = true;
            System.out.println("You have checked out "  + bookTitle + ".");
        }
        else {
            isCheckedOut = true;
            System.out.println(bookTitle + " is currently unavailable to check out.");
        }
    }

    public void bookLength(){
        System.out.println(bookTitle + " is " + numberPages + " pages long.");
    }

    public void whatGenre() {
        System.out.println(bookTitle + " is a " + genre + " book.");
    }

    public void returnBook() {
        if(isCheckedOut =  true){
            isCheckedOut = false;
            System.out.println(bookTitle +  " has been returned.");
            System.out.println("Thank you for returning your book!");
        }
        else{
            isCheckedOut = false;
            System.out.println("This title was not checked out.");
        }
    }

    public void putOnHold() {
        if(isCheckedOut = false){
            isOnHold = true;
            System.out.println(bookTitle + " has been put on.");
        }
        else {
            isOnHold = false;
            System.out.println(bookTitle + " is currently unavailable to place on hold.");
        }
    }

    public void returnHold() {
        isOnHold = false;
        System.out.println("You have removed your hold on " + bookTitle + ".");
    }

    public void markDamaged(String damagedPart) {
        isDamaged = true;
        System.out.println("Thank you for letting us know that the " + damagedPart + " of " + bookTitle + " is damaged. Our librarians will fix it soon.");
    }

    public void viewRating(){
        System.out.print(bookTitle + " is rated " + bookRating + " out of 5.0 stars.");
    }

    public void addRating(double addedRating){
        if (addedRating > 5.0){
            addedRating = 5.0;
            System.out.println("Rating limit is 5.0 stars.");
            bookRating = (addedRating + 5.0) / 2;
        }
        else if (addedRating < 0.0){
            addedRating = 0.0;
            System.out.println("Rating limit is 0.0 stars.");
        }
        else{
            bookRating = (addedRating + 5.0) / 2;
        }

    }
    
}
