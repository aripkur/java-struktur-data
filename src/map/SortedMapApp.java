package map;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
            }
        };
        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);
//        SortedMap<String, String> sortedMap = new TreeMap<>();

        sortedMap.put("aaa", "AAA");
        sortedMap.put("ccc", "CCC");
        sortedMap.put("bbb", "BBB");

        for (var key : sortedMap.keySet()){
            System.out.println(key);
        }
    }
}
