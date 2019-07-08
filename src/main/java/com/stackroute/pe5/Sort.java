package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Sort {

    public ArrayList<String> sortTheSet(Set<String> input)
    {
        TreeSet<String> treeSet = new TreeSet<>(input);

        ArrayList<String> sortedList = new ArrayList<>(treeSet);

        return sortedList;

    }
}