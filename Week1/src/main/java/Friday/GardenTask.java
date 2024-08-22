package Friday;

import java.time.LocalDate;

public class GardenTask extends Task {
    private String gardenLocation;

    GardenTask(String title, String description, LocalDate duedate) {
        super(title, description, duedate);
    }
}
