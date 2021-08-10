package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * LinkedHashMap => terurut
 * HashMap => tidak terurut
 */
public class LinkedHashMapApp {
    public static void main(String[] args) {
//        Map<String, String> map = new LinkedHashMap<>();
        Map<String, String> map = new HashMap<>();

        map.put("last", "Kurniawan");
        map.put("first", "Arip");
        map.put("middle", "abc");
        Set<String> keys = map.keySet();
        for (var key : keys){
            System.out.println(key);
        }

    }
}
