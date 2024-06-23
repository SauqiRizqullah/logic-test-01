package org.example;

import java.util.List;


public class SortCharacter {
    public static List<String> sortCharacter(String kata){
        // 1. lower case
        String afterRegex = kata.replaceAll("[^a-zA-Z]","").toLowerCase();

        // 2. logic pemilahan vowel (vokal) dan consonant (konsonan)
        String vowels = "";
        String consonants = "";


        for (int i = 0; i < afterRegex.length(); i++){

            if (afterRegex.charAt(i) == 'a' || afterRegex.charAt(i) ==  'e' || afterRegex.charAt(i) == 'i' || afterRegex.charAt(i) == 'o' || afterRegex.charAt(i) == 'u'){
                vowels = vowels.concat(Character.toString(afterRegex.charAt(i)));

            } else { // add consonant
                consonants = consonants.concat(Character.toString(afterRegex.charAt(i)));
            }
        }

        List<String> characterList = List.of(vowels,consonants);
        return characterList;
    }
}
