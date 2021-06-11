package oop.assignment2.ex33.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Edelis Molina
 *
 *  Exercise 33 - Magic 8 Ball
 */

import java.util.Random;
import java.util.Scanner;

public class Magic8BallApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Magic8BallApplication app = new Magic8BallApplication();

        String[] answersArray = app.setPossibleAnswersList();

        System.out.print("What's your question?\n> ");
        input.nextLine();

        String answer = app.returnRandomAnswer(answersArray, new Random().nextInt(answersArray.length));
        System.out.println("\n" + answer);
    }

    public String[] setPossibleAnswersList(){
        return new String[]{"Yes.", "No.", "Maybe.", "Ask again later."};
    }

    public String returnRandomAnswer(String[] answersArray, int idx){
        return answersArray[idx];
    }

}
