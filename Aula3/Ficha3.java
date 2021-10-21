package Ficha3;

import java.util.Arrays;

public class Ficha3 {
    public static void main(String[] args) {
        /* 2 */

        // a)
        char character = 'a';
        //char character = 'z';
        char next_char = CharacterUtilities.lowerLetterSuccessorOf(character);
        System.out.println(next_char);

        // b)
        char character_b = 'z';
        //char character = 'a';
        char next_char_b = CharacterUtilities.lowerLetterPredecessorOf(character_b);
        System.out.println(next_char_b);

        // c)
        char character_c = 'z';
        System.out.println(CharacterUtilities.lowerLetterSuccessorStepsOf(character_c, 5));

        // d)
        char character_d = 'c';
        System.out.println(CharacterUtilities.lowerLetterPredecessorStepsOf(character_d, 5));

        // e)
        char[] characters = {'a','d','i','a','i','e','a'};
        System.out.println("Número de vezes: " + CharacterUtilities.ocurrencesOfCharacterIn(characters, 'i'));

        // f)
        char[] characters_f = characters;
        System.out.println(Arrays.toString(CharacterUtilities.replaceCharacterIn(characters_f, 'a', 'z')));

        // g)
        char[] characters_g = characters;
        char[] characters_gg = {'j','q','e'};
        System.out.println(Arrays.toString(CharacterUtilities.concatenationOf(characters_g, characters_gg)));

        // h)
        char[] characters_h = {'a','b','c','d','e','f'};
        System.out.println(Arrays.toString(CharacterUtilities.copyOfPartOf(characters_h, 2, 5)));

        /* 3 */

        // a)
        System.out.println(CaesarCipherDecipherer.cipher("abcd", 2));
        // cdef

        // b)
        System.out.println(CaesarCipherDecipherer.decipher("cdef", 2));
        // abcd
    }
}
