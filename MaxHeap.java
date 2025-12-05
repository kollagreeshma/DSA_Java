class MaxHeap1 {
    int[] heap;
    int size;

    MaxHeap1(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int left(int i) {
        return 2 * i + 1;
    }

    int right(int i) {
        return 2 * i + 2;
    }

    void insert(int val) {

        if (size == heap.length) {
            System.out.println("Heap is full!");
            return;
        }

        heap[size] = val;
        int i = size;
        size++;

        // Heapify up
        while (i > 0 && heap[i] > heap[parent(i)]) {
            int temp = heap[i];
            heap[i] = heap[parent(i)];
            heap[parent(i)] = temp;

            i = parent(i);
        }
    }
    int extractMax(){
        int root = heap[0];
        heap[0]=heap[size-1];
        size--;
        heapify(0);
        return root;
    }
    void heapify(int i){
        int largest = i;
        int l =left(i);
        int r = right(i);
        if(l < size && heap[l] > heap[largest]) largest = l;
        if(r < size && heap[r] > heap[largest]) largest = r;
        if(largest != i){
            int temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;
            heapify(largest);
        }
    }

    // Print function
    void printHeap() {
        for (int i = 0; i < size; i++)
            System.out.print(heap[i] + " ");
        System.out.println();
    }
}

public class MaxHeap {
    public static void main(String[] args) {

        MaxHeap1 mh = new MaxHeap1(10);
        mh.insert(20);
        mh.insert(15);
        mh.insert(30);
        mh.insert(40);
        mh.insert(10);
        mh.insert(45);
        mh.insert(78);

        System.out.println("Max Heap:");
        mh.printHeap();
        System.out.println("Extracted Max: " + mh.extractMax());
        System.out.println("Heap After Extract:");
        mh.printHeap();
    }
}

