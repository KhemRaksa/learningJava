package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class qqqqqq {

    /*

        A Queue = FIFO data structure, first in - first out (Like a line of people).
                  A collection designed for holding elements prior to processing Linear data structure

                  add = enqueue, offer
                  remove  = dequeue, poll

     */

    public static void someQueueOperations() {

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Stevee");
        queue.offer("Harold");

        System.out.println(queue);

    }

}
