package Ficha3;

import java.util.Arrays;

public class CaesarCipherDecipherer {

    // a)
    public static String cipher(String victim, int steps) {
        String victims = "";
        for (int i = 0; i < victim.length(); i++) {
            victims += CharacterUtilities.lowerLetterSuccessorStepsOf(victim.charAt(i), steps);
        }
        return victims;
    }

    // b)
    public static String decipher(String victim, int steps) {
        String victims = "";
        for (int i = 0; i < victim.length(); i++) {
            victims += CharacterUtilities.lowerLetterPredecessorStepsOf(victim.charAt(i), steps);
        }
        return victims;
    }
}
