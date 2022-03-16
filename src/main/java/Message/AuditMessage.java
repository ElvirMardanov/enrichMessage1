package Message;

import storage.StorageMeccage;

import java.util.Objects;

public class AuditMessage extends DataSource {
    StorageMeccage storageMeccage;

    public AuditMessage(Message message) {
        super(message);
    }

    @Override
    public void readMessage(String json) {
        super.readMessage(json);
    }

    @Override
    public void writeMessage() {
        if (cehckMSDIN()) {
            super.writeMessage();
        }else {
            System.out.println("Don't fit type");
        }
    }

    public boolean cehckMSDIN() {
        storageMeccage = new StorageMeccage();
        return Objects.equals(storageMeccage.getType(), "MSIDN");
    }

}
