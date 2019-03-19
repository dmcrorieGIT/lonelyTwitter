package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class Book implements Component {

    String name;
    Book(String name){
        this.name = name;
    }

    public void getBookName(){
        Log.d("MY_DEBUG", name);
    }
}
