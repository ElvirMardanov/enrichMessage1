import Message.MessageValidator;

public class Main {

    public static void main(String[] args) {
        String json = "{\n" +
                "    \"action\": \"button_click\",\n" +
                "    \"page\": \"book_card\",\n" +
                "    \"msisdn\": \"88005553535\"\n" +
                "}";
        MessageValidator messageValidator = new MessageValidator(json);
        messageValidator.readMessage(json);
        System.out.println(messageValidator.enricMessage());
    }
}