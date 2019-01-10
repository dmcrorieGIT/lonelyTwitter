package ca.ualberta.cs.lonelytwitter;

public class Sad extends Mood {

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        super.date = date;
    }

    public void setSad(String mood) {
        super.mood = "I am Sad...";
    }
}
