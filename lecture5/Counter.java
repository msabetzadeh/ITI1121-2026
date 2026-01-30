public class Counter {
	private int value = 0;
		
	public int getValue() {
		return this.value;
	}
	
	public void increment() {
		this.value++;
	}
	
	public void reset () {
		this.value = 0;
	}
	
	public static void main (String args[]) {
	
		Counter counter = new Counter();
		counter.increment();
		counter.increment();
	
		System.out.println(counter.getValue());
		
		Counter counter2 = new Counter();
		counter2.increment();
		counter2.increment();
		counter2.increment();
		counter2.increment();
		counter2.increment();
		counter2.increment();	
		
		System.out.println(counter2.getValue());

	}
}