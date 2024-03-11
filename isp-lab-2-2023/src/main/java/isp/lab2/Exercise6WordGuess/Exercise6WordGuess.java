package isp.lab2.Exercise6WordGuess;

public class Exercise6WordGuess {

    /**
     * This method will return the number of occurrences of a character in a word
     * @param c
     * @param word
     * @return
     */
    public static int countOccurence(char c, char[] word) {
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i] == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        char c = 'l';
        int count = countOccurence(c, word);
        System.out.println("The character " + c + " occurs " + count + " times in the word.");
    }

}
