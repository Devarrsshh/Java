package com.company;

import java.util.*;
public class cwh_95_HashSet {
    public static void main (String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(4, 0.5f);
        // this is how add() works

        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);

        HashSet<Integer> myHashSet1 = new HashSet<>();
        System.out.println(myHashSet);

        // this is how remove() works
        myHashSet.remove(3);
        System.out.println(myHashSet);

        // this is how empty() works
        System.out.println(myHashSet1.isEmpty());

        // this is how size() works
        System.out.println(myHashSet.size());

        // this is how clear() works
        myHashSet.clear();
        System.out.println(myHashSet);

    }
}