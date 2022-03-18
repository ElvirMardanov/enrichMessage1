package Message;

import storage.EnrichmentType;

public class Message {
    private String action;
    private String page;
    private String msisdn;
    private String firstName;
    private String lastName;
    private EnrichmentType typeMessage = EnrichmentType.MSISDN;

    public EnrichmentType getTypeMessage() {
        return typeMessage;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return  "{" +
                "action= " + action +
                ", page= " + page +
                ", msisdn= " + msisdn +
                ", firstName= " + firstName +
                ", lastName= " + lastName + "}";
    }
}

