package map;

import java.util.HashMap;
import java.util.Map;

/**
 * mirip array asosiative PHP versi lebih ribet :)
 */
public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name.first", "Arip");
        map.put("name.last", "Kurniawan");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.last"));
    }
}
