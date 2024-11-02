package MidTermSprint;

class User {
    String name;
    TaskList taskList;

    // Constructor to initialize a user with a name and a task list
    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    // Method to add a task to the user's task list
    public void addTask(String description) {
        Task newTask = new Task(description);
        taskList.addTask(newTask);
    }

    // Method to mark a task as completed
    public void markTaskCompleted(int taskNumber) {
        taskList.markTaskCompleted(taskNumber);
    }

    // Method to print all tasks
    public void printTasks() {
        System.out.println("Tasks for " + name + ":");
        taskList.printTasks();
    }
}

