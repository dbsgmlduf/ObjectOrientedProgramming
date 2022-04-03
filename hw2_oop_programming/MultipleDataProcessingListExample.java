
/* put proper import statemtents here */
import java.util.Scanner;
import java.util.ArrayList;

public class MultipleDataProcessingListExample {
    public static double calculateMean(ArrayList<Integer> scores) /* define calculateMean() method here and below */
    {
        double mean;
        int total = 0;
        for (int i = 1; i < scores.size(); i++) {
            total = total + scores.get(i);
        }
        mean = (double) total / (scores.size() - 1);
        return mean;
    }

    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<Integer>();

        /* Get score inputs using Scanner */

        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        Integer integerObject = null;

        /*
         * Write code lines that (1) get score inputs from the keyboard
         * (2) keep receiving inputs until the user enters -1. The inputs
         * must be stored in scores ArrayList variable defined up. When the
         * scores variable is ready with all the inputs, pass it to
         * calculateMean() method to calculate the mean. Use while or do-while
         * statement for the input looping.
         *
         * NOTE: Do not forget to eliminate -1 entry in the scores list
         * before passing it to calculateMean() method
         */
        while (userInput != -1) {
            integerObject = userInput;
            scores.add(integerObject);
            System.out.println("Entering score");
            userInput = scan.nextInt();
        }
        scan.close();
        System.out.println("Mean for scores: " + calculateMean(scores));
    }
}
