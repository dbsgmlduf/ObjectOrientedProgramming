public class StringExample {
    public static void main(String[] args) {
        /* immutable : read-only */
        String s = new String("hello world");
        String t = s.toUpperCase(); // return 값을 제공

        System.out.println(t);

        /* mutable : read-write */
        StringBuffer sb = new StringBuffer("hello world");
        StringBuffer another = sb;

        sb.insert(1, "abcde"); // return 값이 없음 // Dynamic memory allocation

        System.out.println(sb);
        System.out.println(another);
    }
}
