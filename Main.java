package MidTermSprint;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User[] users = new User[10];  // Array to hold 10 users
        int userCount = 0;

        while (true) {
            System.out.println("\n--- To-Do List Manager ---");
            System.out.println("1. Add User");
            System.out.println("2. Add Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Create a new user
                    System.out.print("Enter user name: ");
                    String name = scanner.nextLine();
                    users[userCount] = new User(name);
                    userCount++;
                    System.out.println("User added!");
                    break;

                case 2:
                    // Add a task to a user's to-do list
                    System.out.print("Enter user index (1 to " + userCount + "): ");
                    int userIndex = scanner.nextInt() - 1;
                    scanner.nextLine();  // Consume newline
                    if (userIndex < 0 || userIndex >= userCount) {
                        System.out.println("Invalid user index.");
                        break;
                    }

                    System.out.print("Enter task description: ");
                    String taskDescription = scanner.nextLine();
                    users[userIndex].addTask(taskDescription);
                    System.out.println("Task added!");
                    break;

                case 3:
                    // Mark a task as completed
                    System.out.print("Enter user index (1 to " + userCount + "): ");
                    userIndex = scanner.nextInt() - 1;
                    if (userIndex < 0 || userIndex >= userCount) {
                        System.out.println("Invalid user index.");
                        break;
                    }

                    users[userIndex].printTasks();
                    System.out.print("Enter task number to mark as completed: ");
                    int taskNumber = scanner.nextInt();
                    users[userIndex].markTaskCompleted(taskNumber);
                    System.out.println("Task marked as completed!");
                    break;

                case 4:
                    // View all tasks for a user
                    System.out.print("Enter user index (1 to " + userCount + "): ");
                    userIndex = scanner.nextInt() - 1;
                    if (userIndex < 0 || userIndex >= userCount) {
                        System.out.println("Invalid user index.");
                        break;
                    }

                    users[userIndex].printTasks();
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}

