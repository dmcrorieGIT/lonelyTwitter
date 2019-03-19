package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.UUID;

/**
 * Created by watts1 on 9/12/17.
 */

public class NormalTweet extends Tweet {



    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date, UUID uuid) {
        super(message, date, uuid);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
