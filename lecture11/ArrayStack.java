public class ArrayStack<E> implements Stack<E> {
	
	private E[] elems;
	private int top;
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		elems = (E[]) new Object[capacity];
		top = 0; // designates the first free cell
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	public void push(E o) {
		// pre-condition: !isFull()
		elems[top] = o;
		top = top + 1;
	
	}
	public E pop() {
		// pre-condition: !isEmpty()
		top = top - 1;
		E saved = elems[top];
		elems[top] = null; // scrubbing the memory!
		return saved;
	}
	
	public E peek() {
		// pre-condition: !isEmpty()
		return elems[top - 1];
	}
}