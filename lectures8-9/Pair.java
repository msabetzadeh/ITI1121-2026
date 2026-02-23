public class Pair<X,Y> {
	private X first;
	private Y second;
	
	public Pair(X first, Y second) {
		this.first = first;
		this.second = second;
	}
	
	public X getFirst() {
		return first;
	}
	
	public Y getSecond() {
		return second;
	}
	
	public static void main(String args[]) {
		Pair<String,String> p1 = new Pair<String,String>("King", "Edward");
		Pair<Integer,String> p2 = new Pair<Integer,String>(1, "Edward");
		String s = p1.getFirst();
		Integer i = p2.getFirst();
		
		System.out.println(p1.getClass() == p2.getClass());
	}
}