package Model;

public class Note {
    private final String title;
    private String body;
    public Note(String title, String body) {
        this.title = title;
        this.body = body;
    }
    public String getTitle() {
        return title;
    }
    public String getBody() {
        return body;
    }
    public void updateBody(String body) {
        this.body = body;
    }
    @Override
    public String toString() {
        return getTitle();
    }
}
