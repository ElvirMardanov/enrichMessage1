package Message;

import storage.StorageMeccage;

public interface Message {
    void readMessage(String json);
    void writeMessage();
}
