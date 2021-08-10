package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(List.of("zzz", "Arip", "kurniawan", "aaa", "bbb"));

//        Collections.sort(list);

        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
            }
        };
        Collections.sort(list, reverse);
        for (var value : list){
            System.out.println(value);
        }
    }

}
