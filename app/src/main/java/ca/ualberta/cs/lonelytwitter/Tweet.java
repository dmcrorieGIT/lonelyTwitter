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

import java.util.Date;

/**
 * Defines the "tweet" class, which is composed of a String and a date (also string)
 * @author Dustin McRorie
 * @version 1.3
 * @see 1.2
 *
 */

public class Tweet {

    String message;
    Date date;

    Tweet(){
        this.message = "default";
    }

    /**
     * Constructor for the "Tweet" object
     * @param message, String type
     */

    Tweet(String message){

        this.message = message;
    }

    /**
     * This method accesses the message attached to a given Tweet object
     * @return message, String type
     */
    public String getMessage(){

        return message;
    }

}
