public class PrintTriangle {
    public static void main(String[] args) {
        /*
         * Print out the following triangular shape
         * using any loop statments.
         */
        for (int i = 0; i < 12; i++) {
            for (int j = 12; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
