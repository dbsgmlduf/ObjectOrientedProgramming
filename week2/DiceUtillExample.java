import java.util.Random;

public class DiceUtillExample {
    public static int diceRoll() {
        Random r = new Random();
        // 객체를 만들어야 한다.
        int number = r.nextInt(6) + 1;

        return number;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("A dice roll: " + diceRoll());
        }
    }
}
