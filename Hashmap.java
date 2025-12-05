import java.util.*;

class Hashcode {
    private int size = 10;
    private LinkedList<Integer>[] table;

    @SuppressWarnings("unchecked")
    Hashcode() {
        table = (LinkedList<Integer>[]) new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public int hash(int data) {
        return data % size;
    }

    public void insert(int data) {
        int index = hash(data);
        table[index].add(data);
    }

    public String search(int key) {
        int index = hash(key);
        if (table[index].contains(key)) {
            return key + " is present in bucket " + index;
        } else {
            return key + " is NOT present in the table";
        }
    }

    public boolean delete(int data) {
        int index = hash(data);
        return table[index].remove(Integer.valueOf(data));
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println("Bucket " + i + ": " + table[i]);
        }
    }
}

public class Hashmap {
    public static void main(String[] args) {
        Hashcode h = new Hashcode();
        h.insert(5);
        h.insert(15);
        h.insert(7);
        h.insert(8);
        h.insert(4);
        h.insert(9);
        h.insert(10);
        h.insert(7);
        h.insert(47);
        h.insert(11);

        h.display();

        System.out.println(h.search(47));
        System.out.println(h.search(48));

        System.out.println("Deleting 7: " + h.delete(7));
        System.out.println("Deleting 100: " + h.delete(100));

        h.display();
    }
}
