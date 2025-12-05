import java.util.*;

public class BFS {
    private Map<Integer, List<Integer>> adjacencyList;

    public BFS() {
        adjacencyList = new HashMap<>();
    }

    public void addNode(int data) {
        adjacencyList.putIfAbsent(data, new ArrayList<>());
    }

    public void addEdge(int v, int u) {
        adjacencyList.get(v).add(u);
        adjacencyList.get(u).add(v);
    }

    // BFS traversal
    public void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        System.out.println("BFS Traversal:");

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbour : adjacencyList.get(current)) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BFS bfs = new BFS();

        // Add nodes
        bfs.addNode(1);
        bfs.addNode(2);
        bfs.addNode(3);
        bfs.addNode(4);
        bfs.addNode(5);
        bfs.addNode(6);

        // Add edges
        bfs.addEdge(1, 2);
        bfs.addEdge(1, 3);
        bfs.addEdge(2, 4);
        bfs.addEdge(2, 5);
        bfs.addEdge(3, 6);
        bfs.bfs(1);
    }
}
