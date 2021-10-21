package Ficha3;

import java.util.Arrays;

public class CharacterUtilities {

    /* 2 */

    // a)
    public static char lowerLetterSuccessorOf(char character) {
        if(character == 'z') {
            return 'a';
        }
        int code = (int) character + 1;
        return (char) code;
    }

    // b)
    public static char lowerLetterPredecessorOf(char character) {
        if(character == 'a') {
            return 'z';
        }
        int code = (int) character - 1;
        return (char) code;
    }

    // c)
    public static char lowerLetterSuccessorStepsOf(char character, int value) {
        int i = 0;
        char new_char = character;
        while(i < value) {
            new_char = lowerLetterSuccessorOf(new_char);
            i++;
        }
        return new_char;
    }


    // d)
    public static char lowerLetterPredecessorStepsOf(char character, int value) {
        int i = 0;
        char new_char = character;
        while(i < value) {
            new_char = lowerLetterPredecessorOf(new_char);
            i++;
        }
        return new_char;
    }

    // e)
    public static int ocurrencesOfCharacterIn(char[] array, char character) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == character) {
                count++;
            }
        }
        return count;
    }

    // f)
    public static char[] replaceCharacterIn(char[] array, char character, char replacer) {
        if(ocurrencesOfCharacterIn(array, character) != 0) {
            char[] new_array = new char[array.length];
            for (int i = 0; i < array.length; i++) {
                new_array[i] = array[i];
                if(new_array[i] == character) {
                    new_array[i] = replacer;
                }
            }
            return new_array;
        } else {
            return array;
        }
    }

    // g)
    public static char[] concatenationOf(char[] array1, char[] array2) {
        char[] new_array = new char[array1.length + array2.length];
        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            new_array[i] = array1[i];
            k = i;
        }
        for (int j = 0; j < array2.length; j++) {
            new_array[++k] = array2[j];
        }
        return new_array;
    }

    // h)
    public static char[] copyOfPartOf(char[] array, int start, int end) {
        char[] new_array = new char[(end - start) + 1];
        for (int i = 0; i < new_array.length; i++) {
            new_array[i] = array[start++];
        }
        return new_array;
    }
}
