package map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 * ini mantap, compare key berdasarkan lokasi memory. kenapa dibuat begitu ?
 * String = "immutable"
 * https://bahasajava.com/mengapa-string-immutable-pada-java/
 */
public class IdentityHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new IdentityHashMap<>();
//        Map<String, String> map = new HashMap<>();

        String key1 = "name.first";

        String name = "name.";
        String first = "first";
        String key2 = name + first;
        String key3 = "name.first";
        String key4 = "name." + "first";

        System.out.println(key1.equals(key2)); // true
        System.out.println(key1 == key2); // false
        System.out.println(key1 == key3); // true
        System.out.println(key1 == key4); // true

        map.put(key1, "Arip");
        map.put(key2, "Arip");
        System.out.println(map.size());
    }
}
