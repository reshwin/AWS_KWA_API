import java.util.HashMap;

public class CaseInsensitiveMap extends HashMap<String, Customer> {

    @Override
    public Customer put(String key, Customer value) {
       return super.put(key.toLowerCase(), value);
    }

    // not @Override because that would require the key parameter to be of type Object
    public Customer get(String key) {
       return super.get(key.toLowerCase());
    }
}