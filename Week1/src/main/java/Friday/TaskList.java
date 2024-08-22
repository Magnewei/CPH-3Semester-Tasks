package Friday;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskList {
    private final List<Task> tasks = new ArrayList<Task>();

    public TaskList() {}

    // Add a task to the list
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Remove a task from the list
    public void removeTask(Task task) {
        tasks.remove(task);
    }

    // Filter tasks based on a keyword in the title or description.
    public List<Task> filterTasks(String keyword) {
        return tasks.stream()
                .filter(task -> task.getTitle().contains(keyword) || task.getDescription().contains(keyword))
                .collect(Collectors.toList());
    }
    
    // Get the list of tasks
    public List<Task> getTasks() {
        return tasks;
    }

    
    // Sort tasks based on the due date
    public void sortTasks() {
        tasks.stream().sorted(Comparator.comparing(Task::getDuedate));
    }

    // Get tasks that are due today.

    public List<Task> getTasksDueToday() {
        LocalDate today = LocalDate.now();
        return tasks.stream()
                .filter(task -> task.getDuedate().isEqual(today))
                .collect(Collectors.toList());
    }

    // Get tasks that are overdue.
    public List<Task> getOverdueTasks() {
        LocalDate today = LocalDate.now();
        return tasks.stream()
                .filter(task -> task.getDuedate().isBefore(today))
                .collect(Collectors.toList());
    }

    // Print the list of tasks.
    public void printTasks() {
        for (Task task : tasks) {
            System.out.println(task.getTitle() + " - " + task.getDescription() + " - " + task.getDuedate());
        }
    }
}
