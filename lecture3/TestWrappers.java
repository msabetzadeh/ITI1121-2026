public class TestWrappers {

	public static void main (String[] args) {
	
	
		long start, stop, elapsed;
	
		long s1 = 0;
	
		start = System.currentTimeMillis();
		
		for (long j = 0; j < 100000000; j++) {
			s1 = s1 + 1;
		}
		
		stop = System.currentTimeMillis();
		
		elapsed = stop - start;
		
		System.out.println("Elapsed: " + elapsed);

	
		Long s2 = 0L;
	
		start = System.currentTimeMillis();

		for (long j = 0; j < 100000000; j++) {
			s2 = s2 + 1;
		}

		stop = System.currentTimeMillis();
		
		elapsed = stop - start;
		
		System.out.println("Elapsed: " + elapsed);



		Long s3 = 0L;
	
		start = System.currentTimeMillis();

		for (long j = 0; j < 100000000; j++) {
			s3 = Long.valueOf(s3.longValue() + 1);
		}

		stop = System.currentTimeMillis();
		
		elapsed = stop - start;
		
		System.out.println("Elapsed: " + elapsed);
		
	}
}