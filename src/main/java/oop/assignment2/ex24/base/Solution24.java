package oop.assignment2.ex24.base;

import java.util.Scanner;

public class Solution24 {
    private static final Scanner in = new Scanner(System.in);

    // Class variables bc we made them static
    private static String word1;
    private static String word2;

    public static void main(String[] args) {
        //read in two strings
        readUserInput();

        AnagramDetector ad = new AnagramDetector();
        boolean result = ad.isAnagram(word1, word2);

        String output = generateOutput(result);

        System.out.println(word1 + " and " + word2 + " " + output);
    }

    public static void readUserInput(){
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        System.out.println("Enter word 1: ");
        word1 = in.nextLine();

        System.out.println("Enter word 2: ");
        word2 = in.nextLine();
    }

    public static String generateOutput(boolean result){
        String output;

        if(result)
            output = "are anagrams.";
        else
            output = "are not anagrams.";

        return output;
    }

}
