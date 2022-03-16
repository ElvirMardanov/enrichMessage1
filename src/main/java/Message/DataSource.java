package Message;

public class DataSource implements Message {
    private Message messageSource;

    public DataSource(Message message){
        this.messageSource = message;
    }

    @Override
    public void readMessage(String json) {
        messageSource.readMessage(json);
    }

    @Override
    public void writeMessage() {
        messageSource.writeMessage();
    }
}
