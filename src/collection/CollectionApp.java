package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("Arip");
        collection.add("Kurniawan");
        collection.addAll(List.of("aaa", "bbb", "ccc"));
        collection.addAll(Arrays.asList("Arraaa", "Arrbbb", "Arrccc"));

        if (collection.contains("Arip"))
            System.out.println("ada");
        if(collection.containsAll(List.of("a", "bbb"))) // true jika ada semua ( && )
            System.out.println("ada2");

        collection.remove("Arip");
        if(collection.remove("asd"))
            System.out.println("remove asd");

        if(collection.removeAll(Arrays.asList("aaa", "Arra"))){ // true jika berhasil remove salah satu ( || )
            System.out.println("hapus");
        }else{
            System.out.println("gahh");
        }

        for (var value : collection){
            System.out.println(value);
        }
    }
}
