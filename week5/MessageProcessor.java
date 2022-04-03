public class MessageProcessor {

    /* attributes : instance variable */
    String message;

    /* Constructor */
    public MessageProcessor(String initMessage) {
        message = initMessage;
    }

    /* methods : */
    // printLine
    public void printLine() {
        System.out.println(message);
    }

    /* getter and setter */
    public String getMessage() {
        return message;
    }

    public void setMessage(String updatedMessage) {
        message = updatedMessage;
    }

    // verticalPrint
    public void verticalPrint() {
        for (char c : message.toCharArray()) {
            System.out.println(c);
        }
    }
}