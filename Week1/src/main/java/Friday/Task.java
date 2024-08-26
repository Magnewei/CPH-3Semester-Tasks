package Friday;

import java.time.LocalDate;

public abstract class Task {
    private String title;
    private String description;
    private LocalDate duedate;
    private String location;

    Task(String title, String description,LocalDate duedate, String location) {
    this.title=title;
    this.description=description;
    this.duedate=duedate;
    this.location=location;
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
