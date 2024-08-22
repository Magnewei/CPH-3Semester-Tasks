package Mandag.TaskFive;

import java.time.LocalDate;
import java.time.temporal.TemporalAmount;


public class Employee {
    private int id;
    private String name;
    private LocalDate birthdate;

    public Employee(int id, String name, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
}