package eight;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prog2_8Test {

	@Test
	
	
	
	public void test() {
		
		int [] numbers = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		//int actual = Prog2_8.min(numbers);
		//int expected = new int(-22);
		assertEquals(-22,Prog2_8.min(numbers));
		
		//fail("Not yet implemented");
	}

}
