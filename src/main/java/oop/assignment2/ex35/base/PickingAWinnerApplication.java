package oop.assignment2.ex35.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 *
 *  Exercise  35 - Picking a Winner
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PickingAWinnerApplication {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        PickingAWinnerApplication app = new PickingAWinnerApplication();

        ArrayList<String> names;
        names = app.readUserInput();

        if(!names.isEmpty()){
            String winner = app.pickWinner(names, new Random().nextInt(names.size()));
            System.out.println("The winner is... "+ winner);
        } else
            System.out.println("Good bye! No names were entered.");

    }


    public ArrayList<String> readUserInput(){
        boolean flag = true;
        ArrayList<String> contestantNames = new ArrayList<>();

        do {
            System.out.print("Enter a name: ");
            String buffer = input.nextLine();
            if(buffer.isBlank())
                flag = false;
            else
                contestantNames.add(buffer);

        } while(flag);

        return contestantNames;
    }

    public String pickWinner(ArrayList<String> names, int idx){
        return names.get(idx);
    }

}
