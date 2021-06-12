package oop.assignment2.ex30.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Edelis Molina
 *
 *  Exercise 30 - Multiplication Table
 */

public class MultiplicationTableApp {
    public static void main(String[] args) {
        MultiplicationTableApp app = new MultiplicationTableApp();
        int width = 2;
        int height = 2;

        String table = app.createMultiplicationTable(width, height);
        System.out.print(table);

    }

    public String createMultiplicationTable(int Width, int Height){
        String output = "";
        for(int i = 1; i <= Width; i++){
            for(int j = 1; j <= Height; j++){
//                System.out.format("%4d",i*j);
                output += String.format("%4d", i*j);
            }
            output += String.format("\n");
        }
//        System.out.print(output);
        return output;
    }
}
