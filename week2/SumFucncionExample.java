public class SumFucncionExample {
    public static int total(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(total(100));
        System.out.println(total(200));
        System.out.println(total(400));
    }
}
