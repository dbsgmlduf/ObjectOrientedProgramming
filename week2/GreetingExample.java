public class GreetingExample {
    public static String greeting(String name) {
        // return이 없을 경우 void type으로 return이 있는 경우 함수의 데이터 타입 설정
        String greetingMessage = "Hello, " + name + "!";
        // System.out.println(greetingMessage);

        return greetingMessage;
    }

    public static void main(String[] args) {
        /*
         * greeting("Hui-Yeol");
         * greeting("Elsa");
         * greeting("James");
         * greeting("Olaf");
         */
        System.out.println(greeting("Hui-Yeol"));
        System.out.println(greeting("Elsa"));
        System.out.println(greeting("James"));
        System.out.println(greeting("Olaf"));
    }
}
// Design decision
// 위의 예제 처럼 return을 사용하는지 또는 사용 안 하는지는 개발자의 Design decision