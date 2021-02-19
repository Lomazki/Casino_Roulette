package by.it.lomazki.roulette.myRoulette_2;

import java.util.ArrayList;
import java.util.List;

public class Counter {

    int x;
    List<Integer> myList = new ArrayList<Integer>();

    public void addMember(Integer x) {
        myList.add(x);
    }

    public int countBlack(boolean black) {
        if (!black) {
            addMember(x++);
        } else {
            myList.clear();
        }
        return myList.size();
    }
}
