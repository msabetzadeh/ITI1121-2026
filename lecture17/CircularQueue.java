// In this implementation of a queue, we use rear = -1 for an empty queue

public class CircularQueue<E> implements Queue<E> {
	private int capacity = 1000;
	private E[] q;
	public int front, rear;
	
	@SuppressWarnings("unchecked")
	public CircularQueue() {
		q = (E[]) new Object[capacity];
		rear = -1; // sentinel value denoting empty queue
		front = 0;
	}
	
	@SuppressWarnings("unchecked")
	public CircularQueue(int capacity) {
		this.capacity = capacity;
		q = (E[]) new Object[capacity];	
		rear = -1; // sentinel value denoting empty queue
		front = 0;	
	}	


    public boolean isEmpty() {
    	return rear == -1;
    }

    public boolean isFull(){
    	return !isEmpty() && ((rear+1)%capacity == front);
    }

    public void enqueue( E o ) {
        if(o == null) {
            throw new NullPointerException("no null object in my queue !");
        }
        if(isFull()){
            throw new IllegalStateException("Queue full!");
        }
        rear = (rear + 1) % capacity;
        q[rear] = o;
    }

    public E peek() {
        if(isEmpty()){
            throw new IllegalStateException("Queue empty!");
        }
        return q[front];
    }
    
    
    public E dequeue() {
        if(isEmpty()){
            throw new IllegalStateException("Queue empty!");
        }
        E result = q[front];
        q[front] = null; // scrub the memory!
        if (front == rear) { // deqeuing is going to leave the queue empty
        	rear = -1;
        	front = 0;
        } else {
        	front = (front + 1) % capacity;
        }
        
        return result;
    } 
    
    
    
    
    
    
    
    
    
    
    
    

/*
    public String toString() {
        StringBuffer res = new StringBuffer();
        res.append("[");
        if(!isEmpty()){
            int cursor = front;
            res.append(q[cursor]);
            while(cursor != rear) {
                cursor = (cursor + 1)%capacity;
                res.append(", " + q[cursor]);
            }
        }
        res.append("]");
        return res.toString();
    }
*/
}
