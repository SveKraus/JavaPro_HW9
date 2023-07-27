package lesson10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HW9 {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, LocalDate.of(2023, 12, 7), "NORMAL", "OPEN"));
        tasks.add(new Task(1, LocalDate.of(2018, 6, 16), "HIGH", "FIXED"));
        tasks.add(new Task(2, LocalDate.of(2025, 1, 27), "NORMAL", "OPEN"));
        tasks.add(new Task(11, LocalDate.of(2023, 7, 14), "HIGH", "FIXED"));


        Collections.sort(tasks);
        System.out.println(tasks);
        tasks.sort(new TaskStatusPriorityComparator());
        System.out.println(tasks);
        tasks.sort(new TaskDateComparator());
        System.out.println(tasks);
    }}
