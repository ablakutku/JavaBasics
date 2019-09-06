package com.uasoft.javafirst;

public class Loops {

    public static void main(String[] args) {


        //for loop

        int[] myNumbers = {18, 24, 42, 65, 72};


        //System.out.println(x);

        for (int i = 0; i < myNumbers.length; i++) {

            int x = myNumbers[i] / 3 * 5;

            //System.out.println(x);
        }


        for(int number : myNumbers) {

            System.out.println(number / 3 * 5);
        }


        //while

        int j = 0;

        while (j < 10) {
        System.out.println("Fuck Windows");

            j++;

        }

    }
}
