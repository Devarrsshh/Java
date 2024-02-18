package com.company;

public class cwh_15_ps3 {
    public static void main(String[] args) {
        // problem 1
        String name = "Jack parker";
        name = name.toLowerCase();
        System.out.println(name);

        // problem 2
        String text = "To lower case";
        text = text.replace(" ", "_");
        System.out.println(text);

        // problem 3
        String letter = "Dear <|name|>, thanks a lot";
        letter = letter.replace("<|name|>", "Sachin");
        System.out.println(letter);

        // problem 4
        String myString = "This string contains     double and tripple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // problem 5
        String letter2 = "Dear Devarsh,\n\t this java course is nice.\nThanks!";
        System.out.println(letter2);
    }
}
