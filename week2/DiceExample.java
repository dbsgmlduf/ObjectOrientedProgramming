public class DiceExample {
    public static int diceRoll() {
        int number = (int) (Math.random() * 6) + 1;

        return number;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("A dice roll: " + diceRoll());
        }
    }
}
