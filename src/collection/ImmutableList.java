package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList {
    public static void main(String[] args) {
        // immutable
        List<String> one = Collections.singletonList("satu");
        List<String> empty = Collections.emptyList();
        List<String> elements = List.of("aaa", "bbb");

//        one.add("asd"); // error UnsupportedOperationException
//        empty.add("asd"); // error UnsupportedOperationException
//        elements.add("asd"); // error UnsupportedOperationException
//        for (var value : empty){
//            System.out.println(value);
//        }

//      mutable
        List<String> mutable = new ArrayList<>();
        mutable.add("Arip");
        mutable.add("Kurniawan");

//      convert mutable ke immutable
        List<String> immutable = Collections.unmodifiableList(mutable);

        for (var value : elements){
            System.out.println(value);
        }
    }
}
