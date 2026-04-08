public class LinkedList {

    //  ----------------------------------------------------------

    private static class Node {
        private Object value;
        private Node next;
        private Node( Object value, Node next ) {
            this.value = value;
            this.next = next;
        }
    }

    //  ----------------------------------------------------------

    private Node first;

    public LinkedList () {
        first = null;
    }

    public boolean isEmpty() {
		return first == null;
    }


    //  ----------------------------------------------------------

    public int size() {
		return size(first);
    }

    private int size(Node p) {
		if (p == null)
		    return 0;
		else
	    	return 1 + size(p.next);
    }

    //  ----------------------------------------------------------

	private void add(Object obj, Node p) {
		if (p.next == null) {
			p.next = new Node (obj, null);
		} else {
			add(obj, p.next);
		}
    	
    }

    public boolean add(Object obj) {
    	if (obj == null) {
    		return false;
    	}
    	
    	if (first == null) {
    		first = new Node(obj, null);
    	} else {
    		add (obj, first);
    	}
    	
    	return true;
    }

 
    //  ----------------------------------------------------------

    public boolean remove(Object obj) {
    	throw new UnsupportedOperationException("To implement ...");
    }

    
    //  ----------------------------------------------------------
    
    //  non-recursive toString
    
    public String toString() {
		String result = "[";
		Node p = first;
	
		while (p != null) {
	    	if (p == first) {
				result = result + p.value;
			}
	    	else {
				result = result + ", " + p.value;
			}
	    	p = p.next;
		}
	
		result = result + "]";
	
		return result;
    }
}
