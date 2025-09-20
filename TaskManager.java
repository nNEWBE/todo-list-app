package TodoListApp;

import java.util.*;

class TaskManager {
    private Set<Task> tasks;
    private Map<Long, Task> taskById;
    private Map<String, List<Task>> taskByDate;

    public TaskManager() {
        tasks = new HashSet<>();
        taskById = new HashMap<>();
        taskByDate = new HashMap<>();
    }

    public void addTask(String message, String date) {
        Task task = new Task(message, date);
        tasks.add(task);
        taskById.put(task.getId(), task);

        taskByDate.putIfAbsent(date, new ArrayList<>());
        taskByDate.get(date).add(task);

        System.out.println("Task added successfully!");
        showAllTasks();
    }

    public void deleteTask(long id) {
        Task task = taskById.remove(id);
        if (task != null) {
            tasks.remove(task);
            taskByDate.get(task.getDate()).remove(task);
            if (taskByDate.get(task.getDate()).isEmpty()) {
                taskByDate.remove(task.getDate());
            }
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Task with id " + id + " not found.");
        }
        showAllTasks();
    }

    public void viewTaskById(long id) {
        Task task = taskById.get(id);
        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task with id " + id + " not found.");
        }
    }

    public void viewTaskByDate(String date) {
        List<Task> list = taskByDate.get(date);
        if (list != null && !list.isEmpty()) {
            for (Task t : list) {
                System.out.println(t);
            }
        } else {
            System.out.println("No tasks found on date " + date);
        }
    }

    public void showAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("All Tasks:");
            for (Task t : tasks) {
                System.out.println(t);
            }
        }
    }
}
