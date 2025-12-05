import java.util.*;
public class stringgraph1 {
    private Map<String, List<String>> connections = new HashMap<>();
    public void addHero(String hero){
        connections.putIfAbsent(hero, new ArrayList<>());
    }
    public void addConnection(String hero1, String hero2){
        addHero(hero1);
        addHero(hero2);

    }
}  
