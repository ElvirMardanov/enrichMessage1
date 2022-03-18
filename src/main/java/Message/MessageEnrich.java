package Message;

import com.google.gson.Gson;
import repository.UserRepository;
import storage.EnrichmentType;
import java.util.ArrayList;
import java.util.logging.Logger;

public class MessageEnrich implements EnrichMessage {
    private String json;
    private EnrichmentType enrichmentType;
    private Message message;
    private UserRepository userRepository;
    private MessageValidator messageValidator;
    Gson gsonParser;
    Logger logger = Logger.getLogger(this.getClass().getName());

    public MessageEnrich(String json) {
        this.json = json;
    }

    @Override
    public String enrichMessage() {
        message = new Message();
        userRepository = new UserRepository();
        ArrayList<Message> enrichMessages = new ArrayList<>();
        ArrayList<String> notEnrichMessages = new ArrayList<>();
        messageValidator = new MessageValidator(message.getTypeMessage());
        if (messageValidator.validatorMessge()){
            gsonParser = new Gson();
            message = gsonParser.fromJson(json, Message.class);
            String nameFirstAndLast = userRepository.findByMsisdn(message.getMsisdn());
            String[] arrayName = nameFirstAndLast.split(",");
            message.setFirstName(arrayName[0]);
            message.setLastName(arrayName[1]);
            enrichMessages.add(message);
            return message.toString();
        } else {
            notEnrichMessages.add(json);
            return json;
        }
    }
}