public class MyInteger {
	int value;
	
	MyInteger (int v) {
		value = v;
	}
	
	public boolean equals (MyInteger other) {
		return value == other.value;
	}

}