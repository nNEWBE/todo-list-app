package TodoListApp;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {
            System.out.print("\nEnter command: ");
            String command = sc.nextLine().trim();

            if (command.equalsIgnoreCase("a")) {
                System.out.print("Message: ");
                String message = sc.nextLine();

                System.out.print("Date (dd/MM/yyyy): ");
                String date = sc.nextLine();

                if (!isValidDate(date)) {
                    System.out.println("Invalid date format! Please use dd/MM/yyyy");
                    continue;
                }

                manager.addTask(message, date);

            } else if (command.startsWith("v")) {
                String arg = command.substring(1);
                if (arg.matches("\\d+")) {
                    long id = Long.parseLong(arg);
                    manager.viewTaskById(id);
                } else {
                    manager.viewTaskByDate(arg);
                }

            } else if (command.startsWith("d")) {
                String arg = command.substring(1);
                if (arg.matches("\\d+")) {
                    long id = Long.parseLong(arg);
                    manager.deleteTask(id);
                } else {
                    System.out.println("Invalid delete command. Use d<id>.");
                }

            } else {
                System.out.println("Invalid command. Use 'a' to add, 'v<id>' or 'v<date>' to view, 'd<id>' to delete.");
            }
        }
    }

    private static boolean isValidDate(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            sdf.parse(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
