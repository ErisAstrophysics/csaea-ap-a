public class Song {

/*
 * Song: blueprint for Song objects.
 * New method: toString()
 *
 * toString() returns a String that describes an object.
 * Header -- copy it exactly:   public String toString()
 * It RETURNS text. It does not print.
 */

    
    //ATTRIBUTES instance variables hold data for each song instance 

    private String title;
    private String artist;
    private int plays;
    private String stars;

    //CONSTRUCTOR

    public Song(String title, String artist) {

        this.title = title;
        this.artist = artist;
        plays = 0;
        stars = "";
    }

    //METHODS/BEHAVIORS


    // ===== CHALLENGE 1 =====
    // "1 plays" is wrong. Fix toString() so it returns "1 play" for one play
    // and "plays" for everything else.  Tool: if/else
    public void play() {
        plays++;
    }

    public int getPlays() {
        System.out.println(plays);
        return plays;
    }

    public String toString() {
        if (plays == 1){
            return title + " by " + artist + " - " + plays + " play.";
        }
        else{
            return title + " by " + artist + " - " + plays + " plays.";
        }
    }

     // ===== CHALLENGE 2 =====
    // Create a new method called getStars()
    // Return one * for each play.   3 plays -> "***"    0 plays -> ""
    // Tool: for loop    
    public void getStars(){
        for(int i = 0; i < plays; i++){
            stars += "*";
        }
        System.out.println(stars);
    }



}
