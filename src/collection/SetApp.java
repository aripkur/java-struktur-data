package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * SET
 * menyimpan data unik
 *
 * HashSet => data tidak terurut
 * LinkedHashSet => data terurut (sesuai waktu operasi tambah)
 */
public class SetApp {
    public static void main(String[] args) {

//        Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();
        names.add("aaa");
        names.add("bbb");
        names.add("aaa");
        names.add("ccc");
        names.add("ddd");
        names.add("fff");
        names.add("eee");
        names.add("ddd");

        for (var value : names)
            System.out.println(value);
    }
}
