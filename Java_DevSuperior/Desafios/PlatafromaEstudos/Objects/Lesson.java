package Objects;

public abstract class Lesson {
    protected String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Lesson() {
    }

    public Lesson(String title) {
        this.title = title;
    }

    public abstract int duration();
}
