package main;

import java.util.ArrayList;
import java.util.List;

public class StringHandler {
    private String string;

    public StringHandler(String string) {
        this.string = string;
    }

    public String toUpperCase() {
        return string.toUpperCase();
    }

    public String toLowerCase() {
        return string.toLowerCase();
    }

    public String reverse() {
        return new StringBuilder(string).reverse().toString();
    }

    public boolean isPhrase() {
        return string.trim().contains(" ");
    }

    private boolean isPalindromeWord(String word) {
        String cleaned = word.toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public boolean isPalindrome() {
        if(isPhrase()) {
            for(String word : string.split(" ")) {
                if(!isPalindromeWord(word)) {
                    return false;
                }
            }
            return true;
        } else {
            return isPalindromeWord(string);
        }
    }

    public List<String> getPalindromesInPhrase() {
        List<String> palindromes = new ArrayList<>();
        if(isPhrase()) {
            for(String word : string.split(" ")) {
                if(isPalindromeWord(word)) {
                    palindromes.add(word);
                }
            }
        } else if(isPalindromeWord(string)) {
            palindromes.add(string);
        }
        return palindromes;
    }

    public void countVowelsAndConsonants() {
        int vowels = 0;
        int consonants = 0;
        String lower = string.toLowerCase();

        for(char c : lower.toCharArray()) {
            if(Character.isLetter(c)) {
                if("aeiou".indexOf(c) >= 0) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vocales: " + vowels);
        System.out.println("Consonantes: " + consonants);
    }
}

