package Message;

import com.google.gson.Gson;
import storage.StorageMeccage;
import storage.User;

import java.util.HashSet;
import java.util.Set;

public class MessageValidator implements Message {
    private static String json;
    StorageMeccage storageMeccage;
    Gson gsonParser;

    public MessageValidator(String json) {
        MessageValidator.json = json;
    }

    @Override
    public void readMessage(String json) {
        gsonParser = new Gson();
        storageMeccage = gsonParser.fromJson(json, StorageMeccage.class);
        System.out.println(storageMeccage.getMsisdn());
    }

    @Override
    public void writeMessage() {
        Set<User> usersSet = new HashSet<>();
        usersSet.add(new User("88005553535", "Максим1", "Иванов1"));
        usersSet.add(new User("288005553535", "Максим2", "Иванов2"));
        for (User user : usersSet) {
            if (user.getMsisdn().equals(storageMeccage.getMsisdn())) { //user.getMsisdn() == storageMeccage.getMsisdn()
                storageMeccage.setFirstName(user.getFirstName());
                storageMeccage.setLastName(user.getLastName());
                System.out.println(storageMeccage.toString());
                break;
            } else {
                System.out.println("Нету");
            }
        }
    }
}