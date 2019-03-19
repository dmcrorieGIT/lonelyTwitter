package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class User implements Component {

    ArrayList<Component> children = new ArrayList<Component>(0);

    public void add(Component c){
        children.add(c);
    }

    public void remove(Component c){
        children.remove(c);
    }

    public ArrayList<Component> getChildren(){
        return children;
    }

    public void getBookName() {
        for (Component c: getChildren()){
            c.getBookName();
        }
    }
}
