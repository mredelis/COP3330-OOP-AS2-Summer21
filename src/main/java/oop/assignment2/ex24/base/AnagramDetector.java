package oop.assignment2.ex24.base;

import java.util.Arrays;
import java.util.Locale;

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2){
        // remove whitespaces in both words
        String w1 = word1.replaceAll("\\s", "");
        String w2 = word2.replaceAll("\\s", "");

        boolean flag = true;

        // if words have different lengths are not anagrams
        if(w1.length() != w2.length())
            flag = false;
        // if words have the same length, them they must have same letters to be anagrams
        else{
            char[] ArrayW1 = w1.toLowerCase().toCharArray();
            char[] ArrayW2 = w2.toLowerCase().toCharArray();

            Arrays.sort(ArrayW1);
            Arrays.sort(ArrayW2);

            flag = Arrays.equals(ArrayW1, ArrayW2);
        }

        return flag;
    }
}
