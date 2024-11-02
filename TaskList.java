package MidTermSprint;
class TaskList {
    private Node head;

    // Inner class representing a node in the linked list
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
        }
    }

    // Method to add a task to the task list
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to mark a task as completed (by index)
    public void markTaskCompleted(int taskNumber) {
        Node temp = head;
        int count = 1;

        while (temp != null && count != taskNumber) {
            temp = temp.next;
            count++;
        }

        if (temp != null) {
            temp.task.markCompleted();
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // Method to print all tasks
    public void printTasks() {
        Node temp = head;
        int taskNumber = 1;

        if (temp == null) {
            System.out.println("No tasks found.");
        }

        while (temp != null) {
            System.out.println(taskNumber + ". " + temp.task.toString());
            temp = temp.next;
            taskNumber++;
        }
    }
}

