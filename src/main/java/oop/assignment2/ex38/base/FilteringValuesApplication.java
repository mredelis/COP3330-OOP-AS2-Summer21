package oop.assignment2.ex38.base;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FilteringValuesApplication {
    private static final Scanner input = new Scanner(System.in).useDelimiter("\\s+");
    private static final ArrayList<Integer> intArray = new ArrayList<>();

    public static void main(String[] args) {

        FilteringValuesApplication app = new FilteringValuesApplication();
        app.readUserInput();

        for(int i = 0; i < intArray.size(); i++)
            System.out.println(intArray.get(i));

//        app.returnEvenValues(new int[]{1, 2});
    }

    // Per exercise guideline, create own algorithm to convert input to array
    public void readUserInput(){
        int number;
        System.out.print("Enter numbers: ");
        while (input.hasNext()){
            try {
                number = input.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Wrong!");
                input.next();
                continue;
            }
            System.out.println(number);
        }


    }

    // Per exercise guideline, the function takes in the old array and returns the new array
    public ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> originalArray){
        ArrayList<Integer> newArray = new ArrayList<>();

        if(!originalArray.isEmpty()){
            for(int i = 0; i < originalArray.size(); i++){
                if (originalArray.get(i) % 2 == 0)
                    newArray.add(originalArray.get(i));
            }
        }

        return newArray;
    }

}
