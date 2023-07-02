package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);


        //find the number at first
        System.out.println(queue.peek());

        //Deleting in queue
        while(!queue.isEmpty())
        {
            int itemDeleted = queue.remove();
            System.out.println(itemDeleted + " is removed");
        }
    }
}
