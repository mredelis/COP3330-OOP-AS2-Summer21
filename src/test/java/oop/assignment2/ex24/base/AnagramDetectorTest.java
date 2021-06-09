package oop.assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_true_for_anagrams() {

        // given
        AnagramDetector detector = new AnagramDetector();

        // when something happens
        boolean actual = detector.isAnagram("notepad", "tonedap");

        // then
        assertTrue(actual);
    }

    @Test
    void  isAnagram_returns_false_for_anagrams(){
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("notepad", "pad");

        // then
        assertFalse(actual);
    }
}