public class Test {

    public static void main( String[] args ) {

        Queue<Integer> queue = new LinkedQueue<Integer>();

        for ( int i=0; i<10; i++ ) {
            queue.enqueue(i);
        }
        
        System.out.println("Initial Queue: " + queue);
        while (!queue.isEmpty()){
            System.out.print("Dequeued: " + queue.dequeue() + "; ");
            System.out.println("Current Queue: " + queue);
        }
    }
}