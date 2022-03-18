package Message;

import storage.StorageMeccage;

public interface Message {
    /**
     * read the incoming message and distribute
     * @param message the incoming message
     */
    void readMessage(String message);

    /**
     * enricment the incoming message
     */
    String enricMessage();
}
