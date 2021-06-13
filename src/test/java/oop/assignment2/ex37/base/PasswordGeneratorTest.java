package oop.assignment2.ex37.base;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;


class PasswordGeneratorTest {

    static Stream<Arguments> produceChars_Numbers_Letters_Count(){
        return Stream.of(
            arguments(3, 2, 6),
            arguments(5, 5, 15),
            arguments(2, 2, 6));
    }

    @ParameterizedTest
    @MethodSource("produceChars_Numbers_Letters_Count")
    public void test_passGenerator_Letters(int symbol, int numbers, int letters){
        PasswordGenerator passGen = new PasswordGenerator();
        String password = passGen.PassGenerator(symbol, numbers, letters);

        int lettersCount = 0;

        for(char c: password.toCharArray()){
            if(c >= 97 && c<= 122)
                lettersCount++;
        }

        assertTrue(lettersCount == letters, "Password generator failed for letters");

    }

    @ParameterizedTest
    @MethodSource("produceChars_Numbers_Letters_Count")
    public void test_passGenerator_Numbers(int symbol, int numbers, int letters){
        PasswordGenerator passGen = new PasswordGenerator();
        String password = passGen.PassGenerator(symbol, numbers, letters);

        int numbersCount = 0;

        for(char c: password.toCharArray()){
            if(c >= 48 && c<= 57)
                numbersCount++;
        }

        assertTrue(numbersCount == numbers, "Password generator failed for numbers");

    }



}

