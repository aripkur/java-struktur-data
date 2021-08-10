package collection;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("aaa", "bbb", "ccc"));

        NavigableSet<String> namesReversed = names.descendingSet();

        for (var name : namesReversed){
            System.out.println(name);
        }
    }
}
