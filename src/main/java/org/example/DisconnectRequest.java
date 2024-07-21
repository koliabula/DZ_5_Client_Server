package org.example;

public class DisconnectRequest extends AbstractRequest {
    public static final String TYPE = "broadcastMessage";

    private String recipient;
    private String message;

    public String getRecipient() {
        return recipient;
    }

    public DisconnectRequest() {
        setType(TYPE);
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
