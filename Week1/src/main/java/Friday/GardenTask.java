package Friday;

import java.time.LocalDate;

public class GardenTask extends Task {

    GardenTask(String title, String description, LocalDate duedate, String gardenLocation) {
        super(title, description, duedate, gardenLocation);
    }
}
