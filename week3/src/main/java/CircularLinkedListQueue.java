import java.util.LinkedList;

public class CircularLinkedListQueue {
    private Node rear;
    private Node front;
    private int size = 0;

    public CircularLinkedListQueue() {
        rear = null;
        front = null;
    }

    public void enQueue(int key) {
        Node temp = new Node(key);
        if (size == 0) {
            this.rear = temp;
            this.front = temp;
            this.size++;
        } else {
            this.rear.next = temp;
            rear = temp;
            rear.next = front;
            this.size++;
        }
    }

    public Node deQueue() {
        Node temp = front;
        front = front.next;
        rear.next =front;
        this.size--;
        return temp;
    }

    public void displayQueue() {
        Node temp = front;
        for (int i = 0; i < this.size; i++) {
            System.out.println(temp.key);
            temp = temp.next;
        }
    }

    static class Node {
        public int key;
        public Node next;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }
}
