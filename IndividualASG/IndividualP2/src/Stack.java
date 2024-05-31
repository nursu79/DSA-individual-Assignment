

public class Stack {



    Node head;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    int pop() {
        if (head == null) {
            return -1;
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    int peek() {
        if (head == null) {
            return -1;
        }
        return head.data;
    

}
}
