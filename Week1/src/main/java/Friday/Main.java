package Friday;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        TaskList tasklist = new TaskList();
        tasklist.addTask(new GardenTask("Task 1", "Description 1", LocalDate.of(2024, 12, 22)));
        tasklist.addTask(new GardenTask("Task 2", "Description 2", LocalDate.of(2024, 11, 21)));
        tasklist.addTask(new GardenTask("Task 3", "Description 3", LocalDate.of(2024, 10, 20)));
        tasklist.addTask(new GardenTask("Task 4", "Description 4", LocalDate.of(2024, 9, 19)));
        tasklist.addTask(new GardenTask("Task 5", "Description 5", LocalDate.of(2024, 8, 18)));

       tasklist.sortTasks();
       tasklist.printTasks();

    }
}