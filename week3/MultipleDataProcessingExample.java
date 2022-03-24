public class MultipleDataProcessingExample {
    public static void main(String[] args) {
        int[] scores = { 80, 90, 86, 92, 91, 88 };
        double mean;

        /* find mean using for loop */
        int sum = 0;
        for (int s : scores) {
            sum = sum + s;
        }
        mean = (double) sum / scores.length;

        System.out.println("Mean for scores: " + mean);
    }
}
