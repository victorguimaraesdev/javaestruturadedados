import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Queue;
public class App {
    public static void main(String[] args) throws Exception {
            //List
            List<String> list = new ArrayList<String>();
            list.add("Victor");
            list.add("Bruna");
            String name = list.get(0);
            System.out.println("nome:" + name); 
            System.out.println("Lista do List:" +list);
            //Set
            Set<String> setList = new HashSet<String>();
            setList.add("Victor");
            setList.add("Bruna");
            System.out.println("Lista do Set: " + setList);
            //Map
            Map<String, String> map = new HashMap<String, String>();
            map.put("Nome", "Victor");
            map.put("Ocupação", "Dev");
            System.out.println("Chave Nome do Map:" + map.get("Nome"));
            //Queue
            Queue<String> queue = new LinkedList<String>();
            queue.add("Victor");
            queue.add("Bruna");
            System.out.println("Primeiro valor:" + queue.poll());
            System.out.println("Lista Queue:" + queue);
    }
}
