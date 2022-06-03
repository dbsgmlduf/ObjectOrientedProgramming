
public class Factorial /* put an appropriate class name here */
{
    public static long factorial(long n) /* factorial function header */
    {
        /* factorial function body */
        long result = 1L;
        for (long i = 1; i < n + 1; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        /*
         * Design a function factorial() such that the following code
         * prints out the following output:
         */
        // Long factorialLong = new Long(factorial(20));
        System.out.println("10! = " + factorial(10L));
        System.out.println("20! = " + factorial(20L));

        /*
         * output:
         * 10! = 3628800
         * 20! = 2432902008176640000
         */
    }
}
