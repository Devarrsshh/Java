package com.company;

public class CWH_14_stringMethods {
    public static void main(String[] args) {
        String name = "Harry";
        // System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lString = name.toLowerCase();
        System.out.println(lString);

        String uString = name.toUpperCase();
        System.out.println(uString);

        String nontrimmedString = "      harry      ";
        System.out.println(nontrimmedString);

        String trimmedString = nontrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 5));

        System.out.println(name.replace('r', 'p'));
        System.out.println(name.replace("rry", "ier"));

        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("rry"));

        System.out.println(name.charAt(2));

        // String modifiedName = "Harry";
        // System.out.println(modifiedName.indexOf("rry"));
        // System.out.println(modifiedName.indexOf("rry", 4));
        // System.out.println(modifiedName.lastIndexOf("rsh"));

        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("HARRY"));

        System.out.println("I am escape sequence \n double quote");
    }
}