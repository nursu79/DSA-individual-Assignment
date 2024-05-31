

public class LinkedList {



    Node head;

    void insertAtPos(int pos, int data) {
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < pos - 2; i++) {
            if (current == null) {
                return;
            }
            current = current.next;
        }

        if (current == null) {
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    void deleteAtPosition(int pos) {
        if (head == null) {
            return;
        }

        if (pos == 1) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < pos - 2; i++) {
            if (current == null || current.next == null) {
                return;
            }
            current = current.next;
        }

        if (current.next == null) {
            return;
        }

        current.next = current.next.next;
    }

    void deleteAfterNode(Node node) {
        if (head == null || node == null || node.next == null) {
            return;
        }

        Node nextNode = node.next;
        node.next = nextNode.next;
    }

    boolean searchNode(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

}
