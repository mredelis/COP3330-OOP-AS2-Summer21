package oop.assignment2.ex37.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PasswordGenerator {
   Random random = new Random();

   // Probably length will not be used
   public String PassGenerator(int specialChars, int numbers, int letters){

      String symbolStr = "-/.^&*_!@%=+>)";
      String small_letterStr = "abcdefghijklmnopqrstuvwxyz";
      String numStr = "0123456789";

      ArrayList<Character> charactersArray = generateRandoms(small_letterStr, letters);
      ArrayList<Character> numbersArray = generateRandoms(numStr, numbers);
      ArrayList<Character> specialCharsArray = generateRandoms(symbolStr, specialChars);

      charactersArray.addAll(numbersArray);
      charactersArray.addAll(specialCharsArray);

      Collections.shuffle(charactersArray);

      String passWord = "";
      for (Character character : charactersArray) {
         passWord += character;
      }

      return passWord;
   }


   public ArrayList<Character> generateRandoms(String str, int num){

      ArrayList<Character> temp = new ArrayList<>();

      for(int i = 0; i < num; i++){
         temp.add(str.charAt(random.nextInt(str.length())));
        }

      return temp;
   }
}
