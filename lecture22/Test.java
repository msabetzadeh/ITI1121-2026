public class Test {

    public static void main( String[] args ) {

	LinkedList l = new LinkedList();

	l.addFirst(10);
	l.addFirst(5);
	l.addFirst(2);
	l.addFirst(8);
	l.addFirst(1);
	l.addFirst(7);

	System.out.println( l );

	for ( int i=0; i<12; i++ ) {
	    System.out.println( "test " + i ) ;

	    LinkedList res = l.filterLessThan(i);
	    System.out.println( "(a) " + res );

	}

    }

}
