public class TestStack {
	public static void main (String[] args) {
	
		Stack<Integer> stack = new ArrayStack<Integer>(100);
		
		for (int i = 0; i < args.length; i++) {
			stack.push(Integer.parseInt(args[i]));
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}