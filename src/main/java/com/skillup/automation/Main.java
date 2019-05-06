package com.skillup.automation;

public class Main {

    public static void main(String[] args) {

        // Ссилочні типи даних (передаються по ссилці) // Link data Type

       // Object o = "asd"; //all classes comes from Object. Type is Object, value is String
        //String str = ";"; //набор символов или текст  (array of chars
       // String str2 =""; // array of chars // correct vay of String creation


        // Primitive Типи даних (передаються по значенню)
        //char ch = 'a'; // symbol
        //int asInt = I;
        //long asLong = 123;
        //float asFloat = 123.23F;
        //short asShort = 2;
       // boolean asBoolean = true;  //логическая переменная
       // boolean secondBoolean = Boolean.FALSE;
       // byte asByte = 1;
       // double asDouble = 123.123D;


        Cat CatNika = new Cat("Nika", true);

        Car CarBMW = new Car("BMW","Red");


       // System.out.println(asLong );
        //System.out.println( asShort);
        System.out.println(CarBMW);



    }
}
