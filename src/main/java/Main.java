import Message.MessageEnrich;

public class Main {

    public static void main(String[] args) {
        String json = "{\n" +
                "    \"action\": \"button_click\",\n" +
                "    \"page\": \"book_card\",\n" +
                "    \"msisdn\": \"88005553535\"\n" +
                "}";
        MessageEnrich messageEnrich = new MessageEnrich(json);
        messageEnrich.enrichMessage();
    }
}