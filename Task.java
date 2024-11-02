package MidTermSprint;

class Task {
    String description;
    boolean isCompleted;

    // Constructor to initialize a task
    public Task(String description) {
        this.description = description;
        this.isCompleted = false;  // By default, tasks are pending
    }

    // Method to mark task as completed
    public void markCompleted() {
        this.isCompleted = true;
    }

    // Method to return task description and status
    @Override
    public String toString() {
        return description + " [" + (isCompleted ? "Completed" : "Pending") + "]";
    }
}
