import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayOperations {

	@Test
	public void testSum() {
		System.out.println(arrayOperations.sum(new int[]{2,4,2,4}));
		assertEquals(12,arrayOperations.sum(new int[]{2,4,2,4}));
		
	}
	
	
	@Test
	public void testAvg() {
		
		assertEquals(10,arrayOperations.avg(new int[]{10,10,10,10}));
		
	}
	
	@Test
	public void testEven() {
		
		assertEquals(12,arrayOperations.even(new int[]{2,4,2,4}));
		
	}

	



}
