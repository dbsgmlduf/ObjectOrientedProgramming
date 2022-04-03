import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        int n = 0;

        Scanner scan = new Scanner(System.in);// default scanner make

        System.out.println("Enter an integer: ");
        n = scan.nextInt();

        System.out.println("You Enter: " + n);

        scan.close();
    }
}
