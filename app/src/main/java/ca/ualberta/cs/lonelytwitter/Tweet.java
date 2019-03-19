/*
 * Tweet.java
 *
 * Version 1.0
 *
 * 22/01/2019
 *
 * Developed by Dustin McRorie on 22/01/19 5:21 PM.
 * Last modified 22/01/19 5:20 PM.
 * Copyright (c) 2019. All rights reserved.
 *
 */


package ca.ualberta.cs.lonelytwitter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/**
 * Defines the "tweet" class, which is composed of a String and a date (also string)
 * @author Dustin McRorie
 * @version 1.3
 * @see 1.2
 *
 */

public abstract class Tweet {

    String message;
    Date date;
    private UUID uuid;

    public abstract Boolean isImportant();

    Tweet(){
        this.message = "default";
    }

    public Tweet (String message, Date date, UUID uuid) {
        this.message = message;
        this.date = date;
        this.uuid = uuid;
    }

    /**
     * Constructor for the "Tweet" object
     * @param message, String type
     */

    public Tweet(String message){

        this.message = message;
        this.date = new Date();
        this.uuid = UUID.randomUUID();
    }

    /**
     * This method accesses the message attached to a given Tweet object
     * @return message, String type
     */
    public String getMessage(){

        return message;
    }

    public UUID getUuid(){
        return this.uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
