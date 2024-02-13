package Chapter3.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
     public Map<String,Product> showcase = new HashMap<>();

    public void register(String name,Product prototype) {
        showcase.put(name,prototype);
    }
    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName);
        return p.createCopy();
//        return showcase.get(prototypeName);
    }
}