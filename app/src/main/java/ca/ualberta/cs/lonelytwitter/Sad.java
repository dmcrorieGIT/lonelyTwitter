package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Changes the mood of the super class to a sad message
 * @author Dustin McRorie
 * @version 1.3
 */

public class Sad extends Mood {

    /**
     * Retrieves the current date
     * @return date, String type
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the date of the superclass object
     * @param date, String type
     */
    public void setDate(Date date) {
        super.date = date;
    }

    /**
     * Sets the mood to a sad message
     * @param mood, String type
     */
    public void setSad(String mood) {
        super.mood = "I am Sad...";
    }
}
