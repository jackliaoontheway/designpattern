package structural.flyweight.DeepThinking;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, Flyweight> map = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        Flyweight result = map.get(key);

        if (result == null) {
            result = new ConcreteFlyweight(key);
            map.put(key, result);
        }
        return result;
    }
}
