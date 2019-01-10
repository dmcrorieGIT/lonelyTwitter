package ca.ualberta.cs.lonelytwitter;

public class Happy extends Mood {

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        super.date = date;
    }

    public void setHappy(String mood) {
        super.mood = "I am happy!";
    }
}
