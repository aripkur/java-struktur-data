package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * FIFO & LIFO
 */
public class DequeApp {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // LIFO
//        deque.offerFirst("aaaa");
//        deque.offerFirst("baaaa");
//        deque.offerFirst("caaaa");

        // FIFO
        deque.offerLast("aaaa");
        deque.offerLast("baaaa");
        deque.offerLast("caaaa");

        for (var value : deque){
            System.out.println(value);
        }
    }
}
