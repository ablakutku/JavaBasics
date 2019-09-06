package com.uasoft.javafirst;

public class Variables {

    public static void main(String[] args){


        //Variables
        //Integer Tam Sayı

        int age = 18;

        long myLong = 10;

        System.out.println(myLong*15);

        int y = 5;
        int x = 8;

        System.out.println(y+x);
        System.out.println(y*x);

        //Double - Float Küsüratlı Sayı

        double z = 5.0;
        double a = 11.0;

        System.out.println(a/z);

        float myFloat = 20.0f;

        System.out.println(myFloat*21);

        double pi = 3.14;
        int r = 5;

        System.out.println(2*r*pi);

        //String

        String name = "Utku";
        String surname = "Ablak";

        String fullname = name+" "+surname;

        System.out.println(name);
        System.out.println(surname);
        System.out.println(fullname);

        //Boolean

        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive);
        name = "Baron";
        isAlive = true;
        System.out.println(name+" "+isAlive);

        //Final

        final int myInteger = 5;

        System.out.println("myInteger : " + myInteger);

        //myInteger = 3;

        System.out.println("myInteger : " + myInteger);


    }
}
