/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion.quiz;

/**
 *
 * @author khans4349
 */
public class RecursionQuiz {

    public String reverseString(String word) {

        // base case if word length is 1, returning word
        if (word.length() == 1) {
            return word;
        }

        // if the user doesn't enter a word in
        if (word.length() == 0) {
            return "Need to Enter Word";
        }

        // seperate the first part of the word except the last letter
        String BeginningPortion = word.substring(0, word.length() - 1);

        // seperate the last letter on its own
        String lastLetter = word.substring(word.length() - 1);

        // return the word but backwards by placing the last letter in front
        // keep repeating till the whole word is repeated backwards
        return lastLetter + reverseString(BeginningPortion);


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a test
        RecursionQuiz test = new RecursionQuiz();

        // output trial one
        System.out.println("Test One:");
        System.out.println(test.reverseString("cat"));

        // trial two
        System.out.println("Test Two:");
        System.out.println(test.reverseString("shezar"));

        // trial three
        System.out.println("Test Three");
        System.out.println(test.reverseString(""));

        // trial four
        System.out.println("Test Four");
        System.out.println(test.reverseString("s"));
    }
}
