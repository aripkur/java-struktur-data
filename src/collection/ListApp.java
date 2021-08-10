package collection;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * LinkedList =>  rekomended hanya untuk menambah data dan iterasi data
 * size sekuat memory
 * vs
 * ArrayList => rekomended untuk merubah data, mengambil data, menghapus data tertentu / data spesifik
 * default size 10 data, jika lebih akan membuat array baru. copy list lama masukan di array baru
 *
 * PODOWAE
 */
public class ListApp {
    public static void main(String[] args) {
        long startTime= System.currentTimeMillis();
        List<String> names = new ArrayList<>(); //68098 milidetik
//        List<String> names = new LinkedList<>(); //66887 milidetik

        for (var i = 0; i < 10000000; i++){
            names.add("arip" + i);
        }
//        names.add("Arip");
//        names.add("Arip2");
//        names.add("Arip3");

        for(var value : names){
            System.out.println(value);
        }

        names.set(9000, "asd");
        names.set(9001, "asd");
        names.set(9999, "asd");
        names.set(9999, "asd");
        names.remove(900);
        names.remove(902);
        names.remove(1902);
        for(var value : names){
            System.out.println(value);
        }
        long endTime=System.currentTimeMillis();
        long elapsedTime= endTime - startTime;
        System.out.println("execution time: "+ String.valueOf(elapsedTime)+" milidetik");
    }
}
