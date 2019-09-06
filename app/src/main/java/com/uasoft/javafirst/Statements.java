package com.uasoft.javafirst;

public class Statements {

    public static void main(String[] args) {

        int x = 5;

        System.out.println(x);

        x = x + 1;
        System.out.println(x);

        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        int y = 4;
        System.out.println(x > y);
        System.out.println(y > x);

        y = 6;
        System.out.println(x > y);
        System.out.println(x >= y);
        System.out.println(x == y);
        System.out.println(x != y);

        //and = &&
        //or = ||

        x = 30;
        y = 4;
        int z = 5;

        System.out.println(x < y || z < y);

        // if statements

        if (x > y) {

            System.out.println("x is bigger");
        }

        //switch

        int day = 3;
        String dayString = "";
/*
        if (day == 1) {
            dayString = "Pazartesi";
        } else if (day == 2) {
            dayString = "Salı";
        } else if (day == 3) {
            dayString = "Çarşamba";
        } else {
            dayString = "Pazar";
        }

        */
        //Switch


        switch (day){

            case 1:
                dayString = "Pazartesi";
                break;
            case 2:
                dayString = "Salı";
                break;
            case 3:
                dayString = "Çarşamba";
                break;
            default:
                dayString = "Pazar";
                break;




        }



        System.out.println(dayString);

    }
}