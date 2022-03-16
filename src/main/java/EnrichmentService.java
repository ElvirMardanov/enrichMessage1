import Message.AuditMessage;
import Message.DataSource;
import Message.MessageValidator;

public class EnrichmentService {

    public static void main(String[] args) {
        String json = "{\"action\": \"button_click\", \"page\": \"book_card\", \"msisdn\": \"88005553535\"}";
        DataSource dataSource = new AuditMessage(
                new MessageValidator(json));
        dataSource.readMessage(json);
        dataSource.writeMessage();
    }
}