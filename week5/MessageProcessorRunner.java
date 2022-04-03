public class MessageProcessorRunner {
    public static void main(String[] args) {
        MessageProcessor m = new MessageProcessor("Hello, world!");

        m.printLine();

        /* getter example */
        String s = m.getMessage();
        System.out.println(s);

        /* setter example */
        m.setMessage("Hola!");
        m.printLine();

        m.verticalPrint();
    }
}
