package queue;

/**
 * Test the self-defined queue class.
 *
 * @author  StrongXGP
 * @date    2018/06/17
 */
public class TestLoopQueue {
    public static void main(String[] args) {
        LoopQueue<Integer> queue = new LoopQueue<>();
        for (int i=0; i<10; i++) {
            queue.enqueue(i);
            System.out.println(queue);

            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
