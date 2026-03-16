public class Test2 {

    public static void main( String[] args ) {

        System.out.println("Testing CircularQueue...");
        testCircularQueue();
        
    }

    private static void testCircularQueue(){

        CircularQueue<Integer> queue = new CircularQueue<Integer>(9);

        for (int i = 0; i < 10; i++ ) {
        	if (i == 6) {
        		queue.dequeue();
        	}
            queue.enqueue(i);
        }
        System.out.println("Front: " + queue.front);
        System.out.println("Rear: " + queue.rear);

        while (!queue.isEmpty()){
            //System.out.println(queue);
            System.out.println(queue.dequeue());
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
/*
        CircularQueue<String> queue2 = new CircularQueue<String>(3);
        queue2.enqueue( "a" );
        queue2.enqueue( "b" );
        queue2.enqueue( "c" );
        System.out.println(queue2);
        System.out.println( queue2.dequeue() );
        System.out.println(queue2);
        System.out.println( queue2.dequeue() );
        System.out.println(queue2);
        queue2.enqueue( "d" );
        System.out.println(queue2);
        System.out.println("Front and rear:" + queue2.front + ", " + queue2.rear);
        System.out.println( queue2.dequeue() );
        System.out.println(queue2);
        System.out.println( queue2.dequeue() );
        System.out.println(queue2);

        try{
            queue2.dequeue();
        } catch(IllegalStateException e){
            System.out.println("Exception caught: " + e.getMessage());
        }

        try{
            queue2.enqueue( "a" );
            queue2.enqueue( "b" );
            System.out.println(queue2);
            queue2.enqueue( null );
        } catch(NullPointerException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        try{
            queue2.enqueue( "c" );
            queue2.enqueue( "d" );
        } catch(IllegalStateException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println(queue2);
*/
    }
}