package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Arip");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Arip");

        Map<String, String> immutable = Collections.unmodifiableMap(mutable);
        Map<String, String> map = Map.of(
                "fisrt", "Arip",
                "fisrt1", "Arip1",
                "fisrt2", "Arip2"
        );
    }
}
