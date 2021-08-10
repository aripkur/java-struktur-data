package map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigablesetApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("aaa", "AAA");
        map.put("bbb", "BBB");
        map.put("ccc", "CCC");

        for (var value : map.keySet()){
            System.out.println(value);
        }
        System.out.println("==========");
        System.out.println(map.lowerKey("bbb"));
        System.out.println(map.higherKey("bbb"));
    }
}
