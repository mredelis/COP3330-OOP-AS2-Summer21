package oop.assignment2.ex32.base;

public class InputValidator {
    private final String str;

    public InputValidator(String buffer){
        this.str = buffer;
    }

    public boolean validateInput(){
        int isInteger;
        try {
            isInteger = Integer.parseInt(this.str);
        } catch (NumberFormatException ex){
            return false;
        }
        return true;
    }
}
