package tr.test;

public class Todo {
    private String id;
    private String text;
    private String title;

    public Todo(String id, String text, String title) {
        this.id = id;
        this.text = text;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
