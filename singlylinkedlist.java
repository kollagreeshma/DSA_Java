/*write a program to delete by value or data*/

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class ListOfFunctions {
    static Node head; // global variable

    public static void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void addfirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void indexInsert(int data, int index){
        Node newNode = new Node(data);
        if(index == 0){
            addfirst(data);
            return;
        }
        Node temp = head;
        for(int i = 0; temp != null && i < index - 1; i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Index out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void indexDelete(int index){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(index == 0){
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i = 0; temp != null && i < index - 1; i++){
            temp = temp.next;
        }
        if(temp == null || temp.next == null){
            System.out.println("Index out of the bounds");
            return;
        }
        temp.next = temp.next.next;
    }

    public static void deletebyvalue(int value){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        if(head.data == value){
            head = head.next;
            return;
        }

        Node temp = head;
        while(temp.next != null && temp.next.data != value){
            temp = temp.next;
        }

        if(temp.next == null){
            System.out.println("Value not found");
            return;
        }

        temp.next = temp.next.next;
    }
}

public class singlylinkedlist {
    public static void main(String[] args) {

        ListOfFunctions.insert(10);
        ListOfFunctions.insert(50);
        ListOfFunctions.insert(20);
        ListOfFunctions.insert(60);
        ListOfFunctions.addfirst(70);

        System.out.println("Original List:");
        ListOfFunctions.display();

        ListOfFunctions.indexInsert(80, 3);
        System.out.println("List after insertion:");
        ListOfFunctions.display();

        ListOfFunctions.indexDelete(3);
        System.out.println("List after deletion:");
        ListOfFunctions.display();

        ListOfFunctions.deletebyvalue(20);
        System.out.println("List after deletion by value:");
        ListOfFunctions.display();
    }
}
