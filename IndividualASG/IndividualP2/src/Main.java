
public class Main {


    public static void main(String[] args) {
        // Singly Linked List
        LinkedList list = new LinkedList();

        // Insert nodes
        list.insertAtPos(1, 10);
        list.insertAtPos(2, 20);
        list.insertAtPos(3, 30);
        list.insertAtPos(2, 15);

        // Search for a node
        System.out.println("Searching for 20: " + list.searchNode(20)); // true
        System.out.println("Searching for 50: " + list.searchNode(50)); // false

        // Delete nodes
        list.deleteAtPosition(2);
        list.deleteAfterNode(list.head);

        // Stack
        Stack stack = new Stack();

        // Push elements
        stack.push(40);
        stack.push(50);
        stack.push(60);

        // Pop and peek elements
        System.out.println("Popped element: " + stack.pop()); // 60
        System.out.println("Top element: " + stack.peek()); // 50
    }


}
