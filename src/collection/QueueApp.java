package collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * FIFO
 */
public class QueueApp {
    public static void main(String[] args) {
//        Queue<String> queue = new ArrayDeque<>(10);
        Queue<String> queue = new PriorityQueue<>();
//        Queue<String> queue = new LinkedList<>();

        queue.add("aaa");
        queue.add("caaa");
        queue.add("baaa");
//        for (int i = 0; i < 1000000; i++){
//            queue.add(String.valueOf(i));
//        }

        for (String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }
    }
}
