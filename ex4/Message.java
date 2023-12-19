package ex4;

public class Message {
    private String text;
    private boolean incoming;
    private String who;

    public Message(String text, boolean incoming, String who) {
        this.text = text;
        this.incoming = incoming;
        this.who = who;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setIncoming(boolean incoming) {
        this.incoming = incoming;
    }

    public void setWho(String who) {
        this.who = who;
    }
}
