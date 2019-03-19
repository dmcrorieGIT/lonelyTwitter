package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Changes the mood of the superclass to a happy message
 * @author Dustin McRorie
 * @version 1.3
 */
public class Happy extends Mood {

    /**
     * Returns the current date
     * @return date, String type
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the date of the superclass
     * @param date, String type
     */
    public void setDate(Date date) {
        super.date = date;
    }

    /**
     * Changes the mood to a happy message
     * @param mood, String type
     */
    public void setHappy(String mood) {
        super.mood = "I am happy!";
    }
}
