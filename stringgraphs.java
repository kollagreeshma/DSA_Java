import java.util.*;
public class stringgraphs {

    private Map<String, List<String>> graph = new HashMap<>();
    public void addString(String actor, List<String> connections) {
        graph.put(actor, new ArrayList<>(connections));
    }

    public void printGraph() {
        for (String actor : graph.keySet()) {
            System.out.println(actor + " -> " + graph.get(actor));
        }
    }

    public int countNodes() {
        return graph.size();
    }

    public static void main(String[] args) {

        stringgraphs sg = new stringgraphs();

        sg.addString("Allu Arjun", Arrays.asList("nani", "ram", "ntr", "prabhas", "mahesh"));
        sg.addString("Nani", Arrays.asList("Allu arjun", "ram", "ntr", "prabhas", "mahesh"));
        sg.addString("ram", Arrays.asList("nani", "allu arjun"));
        sg.addString("ntr", Arrays.asList("nani", "prabhas", "mahesh"));
        sg.addString("prabhas", Arrays.asList("allu arjun", "nani", "mahesh"));
        sg.addString("mahesh", Arrays.asList("allu arjun", "nani", "ntr", "prabhas"));

        sg.printGraph();

        System.out.println("Total Nodes: " + sg.countNodes());
    }
}
