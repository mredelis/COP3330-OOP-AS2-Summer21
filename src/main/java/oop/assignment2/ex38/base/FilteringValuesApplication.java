package oop.assignment2.ex38.base;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FilteringValuesApplication {
    private static final Scanner input = new Scanner(System.in);
    private static final ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {

        FilteringValuesApplication app = new FilteringValuesApplication();
        app.getUserInput();

        ArrayList<Integer> newArray = app.filterEvenNumbers(arr);

        System.out.print("The even numbers are ");
        for(int i = 0; i < newArray.size(); i++){
            System.out.printf("%d ", newArray.get(i));
        }
    }

    public void getUserInput(){
        // Per exercise guideline, create own algorithm to convert input to array
        int number;
        System.out.print("Enter numbers: ");
        String buffer = input.nextLine();

        Scanner in = new Scanner(buffer);
        while (in.hasNext()){
            try {
                number = in.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Wrong entry!");
                in.next();
                continue;
            }
//            System.out.println(number);
            arr.add(number);
        }
//        System.out.println("Out of while loop");
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
