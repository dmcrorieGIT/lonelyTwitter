package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.UUID;

/**
 * Stores the mood and date when the mood was changed
 * @author Dustin McRorie
 * @version 1.3
 */
public abstract class Mood {

    protected String mood;
    protected Date date;
    protected UUID uuid;

}
