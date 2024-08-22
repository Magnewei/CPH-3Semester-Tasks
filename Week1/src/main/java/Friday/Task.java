package Friday;

import java.time.LocalDate;

public abstract class Task {
    private String title;
    private String description;
    private LocalDate duedate;

    Task(String title, String description,LocalDate duedate) {
    this.title=title;
    this.description=description;
    this.duedate=duedate;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDuedate() {
        return duedate;
    }
}
