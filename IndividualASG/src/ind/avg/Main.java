package ind.avg;

;

public class Main {
	 public static void main(String[] args) {
	        ToDoList toDoList = new ToDoList();

	        // Add tasks
	        Task task1 = new Task("Finish Project", "Submit DSA and Discrete Project");
	        toDoList.addToDo(task1);

	        Task task2 = new Task("Preparation For Final Exam", "Cover 50% of the topics");
	        toDoList.addToDo(task2);

	        Task task3 = new Task("Hangout", "Having good time out with Freinds");
	        toDoList.addToDo(task3);

	        // Mark task as completed
	        toDoList.markToDoAsCompleted("Finish Project");
	        toDoList.markToDoAsCompleted("Hangout");

	        // View the to-do list
	        toDoList.viewToDoList();
	    }

}
