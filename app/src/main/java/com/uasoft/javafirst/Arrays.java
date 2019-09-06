package com.uasoft.javafirst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args){

        //Array

        String[] myStringArray = new String[4];

        myStringArray[0] = "Utku";
        myStringArray[1] = "Ugur";
        myStringArray[2] = "Ufuk";
        myStringArray[3] = "Demirhan";

        System.out.println(myStringArray[3]);

        int[] myIntegerArray = new int[4];
        myIntegerArray[0] = 18;
        myIntegerArray[1] = 44;
        myIntegerArray[2] = 50;
        myIntegerArray[3] = 19;

        System.out.println(myIntegerArray[3]);

        int[] myNumberArray = {1,2,3,4,5,6,7,8};
        System.out.println(myNumberArray[4]);


        //Lists

        ArrayList<String> myMusicians = new ArrayList<String>();

        myMusicians .add("Eminem");
        myMusicians .add("50 Cent");
        myMusicians .add("2Pac");

        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));

        System.out.println(myMusicians.size());

        //Set

        HashSet<String> mySet = new HashSet<>();
        mySet.add("Gukmanyuk");
        mySet.add("Gukmanyuk");

        System.out.println(mySet.size());


        //HashMap

        HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("name","Utku");
        myHashMap.put("car","BMW");
        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("car"));

        HashMap<String, Integer> mySecondMap = new HashMap<>();
        mySecondMap.put("run",100);
        mySecondMap.put("Football",400);
        mySecondMap.put("Basketball",250);

        System.out.println(mySecondMap.get("run"));




    }

}
