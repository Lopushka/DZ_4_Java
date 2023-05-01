package EX_2;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * EX_2
 */
public class EX_2 {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int index = 0; index < 10; index++) {
            queue.add(index);
        }
        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }

    }

}
