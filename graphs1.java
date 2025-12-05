import java.util.*;

public class graphs1 {
    private Map<Integer, List<Integer>> adjacencyList;

    public graphs1() {
        adjacencyList = new HashMap<>();
    }

    // Add a new node without auto-connecting
    public void addNode(int v) {
        adjacencyList.putIfAbsent(v, new ArrayList<>());
    }

    // Add undirected edge
    public void addEdge(int u, int v) {
        adjacencyList.putIfAbsent(u, new ArrayList<>());
        adjacencyList.putIfAbsent(v, new ArrayList<>());

        if (!adjacencyList.get(u).contains(v)) adjacencyList.get(u).add(v);
        if (!adjacencyList.get(v).contains(u)) adjacencyList.get(v).add(u);
    }

    // Make complete connection when node is added
    public void connectAsCompleteGraph(int v) {
        addNode(v);
        for (int node : adjacencyList.keySet()) {
            if (node != v) {
                addEdge(node, v);
            }
        }
    }

    // Print full adjacency list
    public void printGraph() {
        for (int v : adjacencyList.keySet()) {
            System.out.println(v + " -> " + adjacencyList.get(v));
        }
    }

    // Check if two nodes are connected
    public boolean isConnected(int v, int u) {
        return adjacencyList.containsKey(v) &&
               adjacencyList.get(v).contains(u);
    }

    // Remove edge from both sides
    public void removeEdge(int v, int u) {
        if (adjacencyList.containsKey(v))
            adjacencyList.get(v).remove(Integer.valueOf(u));

        if (adjacencyList.containsKey(u))
            adjacencyList.get(u).remove(Integer.valueOf(v));
    }

    // Count total edges of an undirected graph
    public int countOfEdges() {
        int count = 0;
        for (int node : adjacencyList.keySet()) {
            count += adjacencyList.get(node).size();
        }
        return count / 2;  // each edge counted twice
    }

    // Count adjacency/degree of each node
    public void countOfAdj() {
        for (int v : adjacencyList.keySet()) {
            System.out.println(v + " " + adjacencyList.get(v).size());
        }
    }

    public static void main(String args[]) {
        graphs1 graph = new graphs1();

        // Build complete graph safely
        graph.connectAsCompleteGraph(7);
        graph.connectAsCompleteGraph(6);
        graph.connectAsCompleteGraph(5);
        graph.connectAsCompleteGraph(6); 
        graph.connectAsCompleteGraph(9);
        graph.connectAsCompleteGraph(6); 
        graph.connectAsCompleteGraph(1);

        graph.printGraph();

        graph.removeEdge(9, 1);
        System.out.println("Removed the edge between 9 and 1");
        System.out.println("Is 9 connected to 1? " + graph.isConnected(9, 1));

        System.out.println("Count of edges: " + graph.countOfEdges());

        graph.countOfAdj();
    }
}
