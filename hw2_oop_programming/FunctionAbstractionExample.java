
/* put proper import statemtents here */
import java.util.Scanner;
import java.util.ArrayList;

public class FunctionAbstractionExample {
    public static double calculateMean(ArrayList<Integer> scores) {
        double mean;
        int total = 0;
        for (int i = 1; i < scores.size(); i++) {
            total = total + scores.get(i);
        }
        mean = (double) total / (scores.size() - 1);
        return mean;
    }

    public static ArrayList<Integer> getScoresUntilDone() /* method header for getScoresUntilDone() */
    {
        /*
         * Q: Complete a method getScoresUntilDone() that
         * (1) prints out a prompting message like "Score input? (-1 to quit):"
         * (2) gets individual score inputs from keyboard
         * (2) store them into an ArrayList variable
         * (3) keeps getting keyboard inputs until the user enters -1
         * (4) and returns the ArrayList variable that contain the all the scores
         *
         * NOTE: Make it sure that the method-calling code in main() method
         * can work without modifications.
         *
         * ArrayList<Integer> scores = getScoresUntilDone();
         */
        ArrayList<Integer> getScores = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        Integer integerObject = null;

        while (userInput != -1) {
            integerObject = userInput;
            getScores.add(integerObject);
            System.out.println("Score input? (-1 to quit): ");
            userInput = scan.nextInt();
        }
        scan.close();

        return getScores;
    }

    public static void main(String[] args) {
        ArrayList<Integer> scores = getScoresUntilDone();
        System.out.println("Mean for scores: " + calculateMean(scores));
    }
}
