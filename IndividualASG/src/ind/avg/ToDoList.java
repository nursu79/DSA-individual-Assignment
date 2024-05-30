package ind.avg;


public class ToDoList {

    private Node head;

    public ToDoList() {
        this.head = null;
    }

    public void addToDo(Task task) {
        Node newNode = new Node(task);

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void markToDoAsCompleted(String title) {
        Node current = this.head;
        while (current != null) {
            if (current.getTask().getTitle().equals(title)) {
                current.getTask().markCompleted();
                return;
            }
            current = current.getNext();
        }
        System.out.println("Task with title '" + title + "' not found.");
    }

    public void viewToDoList() {
        Node current = this.head;
        while (current != null) {
            System.out.println("Title: " + current.getTask().getTitle());
            System.out.println("Description: " + current.getTask().getDescription());
            System.out.println("Completed: " + current.getTask().isCompleted());
            System.out.println();
            current = current.getNext();
        }
    }

	
}
