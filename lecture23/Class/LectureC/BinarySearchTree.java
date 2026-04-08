
public class BinarySearchTree < E extends Comparable<E> > {
 
    private static class Node<E> {
        private E value;
        private Node<E> left;
        private Node<E> right;
        private Node( E value ) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    private Node<E> root = null;
    
    private void process( Node<E> current ) {
       System.out.print( " " + current.value );
    }

    public void preOrder() {
        System.out.print("PreOrder: ");
        preOrder( root );
        System.out.print("\n");
    }

    private void preOrder( Node<E> current ) {

        if ( current != null ) {
            process( current );
            preOrder( current.left );
            preOrder( current.right );
        }

    }

    public void inOrder() {
        System.out.print("InOrder: ");
        inOrder( root );
        System.out.print("\n");
    }

    private void inOrder( Node<E> current ) {

        if ( current != null ) {
            inOrder( current.left );
            process( current );
            inOrder( current.right );
        }

    }

    public void postOrder() {
        System.out.print("postOrder: ");
        postOrder( root );
        System.out.print("\n");
    }

    private void postOrder( Node<E> current ) {

        if ( current != null ) {
            postOrder( current.left );
            postOrder( current.right );
            process( current );
        }

    }
    
    public boolean add( E obj ) {
    	if (obj == null) {
    		throw new IllegalArgumentException("No nulls in my BST!");
    	}
    	
    	if (root == null) {
    		root = new Node<E>(obj);
    		return true;
    	}
    	
    	return add(obj, root);
    }

    private boolean add(E obj, Node<E> current ) {
    	boolean result;
    	
    	int test = obj.compareTo(current.value);
    	
    	if (test == 0) {
    		result = false; // we don't want duplicates!
    	} else if (test < 0) { // obj < current.value
    		if (current.left == null) {
    			current.left = new Node<E>(obj);
    			result = true;
    		} else {
    			result = add(obj, current.left);
    		}
    	} else { // test > 0;
    		if (current.right == null) {
    			current.right = new Node<E>(obj);
    			result = true;
    		} else {
    			result = add(obj, current.right);
    		}
    	}
    	
    	return result;
    }

    public String toString() {
        return toString( root, "" );
    }

    private String toString( Node<E> current, String padding ) {

        String result;

        if ( current == null ) {
            
            result = padding + "null\n" ;

        } else {

            result = toString( current.right, padding + "  " );
            result += padding + current.value + "\n";
            result += toString( current.left, padding + "  " );
        }

        return result;
    }

}

