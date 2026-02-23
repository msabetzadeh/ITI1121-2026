public class ArrayStack<T> implements Stack<T> {

	private T[] elems;
	private int top; // designates the first free cell
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		elems = (T[]) new Object[capacity];
		top = 0;
	}
	
	public boolean isEmpty () {
		return (top == 0);
	}
	
	public void push (T o) {
		// pre-condition is that the stack is not full.
		elems[top] = o;
		top = top + 1;
	}
	
	public T pop () {
		// pre-conidition is that the stack is not empty.
		top = top - 1;
		T saved = elems[top];
		elems[top] = null; //scrub the memory!
		return saved;	
	}
	
	public T peek() {
		// pre-conidition is that the stack is not empty.
		return elems[top - 1];
	}
}