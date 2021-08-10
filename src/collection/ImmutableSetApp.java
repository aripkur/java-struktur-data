package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Arip");

        Set<String> mutable = new HashSet<>();
        mutable.add("Arip");
        mutable.add("Kurniawan");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Arip", "Kurniawan");
    }
}
