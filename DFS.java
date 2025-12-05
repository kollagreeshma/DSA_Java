import java.util.*;

public class DFS {
    private Map<Integer, List<Integer>> adjacencyList;

    public DFS() {
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
    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start , visited);
    }
    private void dfsHelper(int node,Set<Integer> visited){
        visited.add(node);
        System.out.println(node+" ");
            for (int neighbour : adjacencyList.get(node)) {
                if (!visited.contains(neighbour)) {
                    dfsHelper(neighbour,visited);
            }
        }
    }

    public static void main(String[] args) {
        DFS dfs = new DFS();

        // Add nodes
        dfs.addNode(1);
        dfs.addNode(2);
        dfs.addNode(3);
        dfs.addNode(4);
        dfs.addNode(5);
        dfs.addNode(6);
        dfs.addNode(1);
        dfs.addNode(3);
        dfs.addNode(4);

        // Add edges
        dfs.addEdge(1, 2);
        dfs.addEdge(1, 3);
        dfs.addEdge(2, 4);
        dfs.addEdge(2, 5);
        dfs.addEdge(3, 6);
        dfs.addEdge(1, 2);
        dfs.addEdge(6 ,4);

        dfs.dfs(1);
    }
}

