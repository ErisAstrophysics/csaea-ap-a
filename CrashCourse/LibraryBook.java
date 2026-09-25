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
        if(isCheckedOut = true) {
            isCheckedOut = true;
            System.out.println(bookTitle + " is currently unavailable to check out.");
        }
        else if(isOnHold = true){
            isOnHold = true;
            System.out.println("This title is currently on hold and cannot be checked out.");
        }
        else {
            isCheckedOut = true;
            System.out.println("You have checked out "  + bookTitle + ".");
        }
    }

    public void bookLength(){
        System.out.println(bookTitle + " is " + numberPages + " pages long.");
    }

    public void whatGenre() {
        System.out.println(bookTitle + " is " + genre + ".");
    }

    public void returnBook() {
        if(isCheckedOut =  true){
            isCheckedOut = false;
            System.out.println(bookTitle +  " has been returned.");
            System.out.println("Thank you for returning your book!");
        }
        else{
            isCheckedOut = false;
            System.out.println("This title was not checked out");
        }
    }

    public void putOnHold() {
        if(isCheckedOut = true){
            isOnHold = false;
            System.out.println(bookTitle + " is currently checked out and cannot be put on hold.");
        }
        else {
            isOnHold = true;
            System.out.println(bookTitle + " has been put on hold.");
        }
    }

    public void returnHold() {
        isOnHold = false;
        System.out.println("You have removed your hold on " + bookTitle + ".");
    }

    public void markDamaged() {
        isDamaged = true;
        System.out.println("Thank you for marking " + bookTitle + " as damaged. Our librarians will fix it soon.");
    }

    public void viewRating(){
        System.out.print(bookTitle + " is rated " + bookRating + " out of 5.0 stars.");
    }

    public void addRating(double addedRating){
        if (addedRating > 5.0){
            addedRating = 5.0;
            System.out.println("Rating limit is 5.0.");
            bookRating = (addedRating + 5.0) / 2;
        }
        else if (addedRating < 0.0){
            addedRating = 0.0;
            System.out.println("Rating limit is 0.0.");
        }
        else{
            bookRating = (addedRating + 5.0) / 2;
        }

    }





    
}
