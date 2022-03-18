package Message;

import com.google.gson.Gson;
import repository.UserRepository;
import storage.EnrichmentType;
import storage.StorageMeccage;
import java.util.logging.Logger;


public class MessageValidator implements Message {
    private String json;
    private EnrichmentType enrichmentType;
    private StorageMeccage repositoryMessage;
    private UserRepository userRepository;
    Gson gsonParser;
    Logger logger = Logger.getLogger(this.getClass().getName());

    public MessageValidator(String json) {
        this.json = json;
    }

    @Override
    public void readMessage(String json) {
        if (!(enrichmentType.MSISDN.equals("MSISDN"))){
            gsonParser = new Gson();
            repositoryMessage = gsonParser.fromJson(json, StorageMeccage.class);
        } else {
            logger.info("Type does't match");
        }
    }

    @Override
    public String enricMessage() {
        userRepository = new UserRepository();
        String nameFirstAndLast = userRepository.findByMsisdn(repositoryMessage.getMsisdn());
        String[] arrayName = nameFirstAndLast.split(",");
        repositoryMessage.setFirstName(arrayName[0]);
        repositoryMessage.setLastName(arrayName[1]);
        return repositoryMessage.toString();
    }
}