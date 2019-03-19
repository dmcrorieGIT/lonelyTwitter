package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetList extends ArrayList<NormalTweet> {

    private static TweetList instance = null;

    private TweetList(){
    }

    public static TweetList getInstance(){

        if (instance == null){
            instance = new TweetList();
        }

        return instance;
    }

}
