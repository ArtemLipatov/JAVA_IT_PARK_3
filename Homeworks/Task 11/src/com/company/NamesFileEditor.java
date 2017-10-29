package com.company;



public class NamesFileEditor {
    public static String addAgeToFile(int age) {
        int lastChar = Integer.parseInt(("" + age).substring(("" + age).length() - 1, ("" + age).length()));
        String old;
        if (age == 11) old = "лет";
        else if (("" + age).endsWith("1")) old = "год";
        else if (age > 11 && age < 15) old = "лет";
        else if (lastChar > 1 && lastChar < 5) old = "года";
        else old = "лет";
        return old;
    }
}
