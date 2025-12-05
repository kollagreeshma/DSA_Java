class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class QueueMethods {
    private Node front = null;
    private Node rear = null;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) { 
            front = rear = newNode;
            return;       
        }
        rear.next = newNode;
        rear = newNode;
    }
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }

        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public int poll() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return -1;
        }

        int removed = front.data;
        front = front.next;

        if (front == null) 
            rear = null;

        return removed;
    }
}

public class priorityqueues {
    public static void main(String[] args) {
        QueueMethods qm = new QueueMethods();

        qm.enqueue(10);
        qm.enqueue(15);
        qm.enqueue(20);
        qm.display();
        qm.poll();
        System.out.println("poll operation");
    }
}