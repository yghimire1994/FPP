package sixth;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prog6Test {

	@Test
	public void test() {
		
		String[] str= {"horse", "dog", "cat", "horse","dog"};
		StringBuffer actual=Prog6.removeDups(str);
		StringBuffer expected=new StringBuffer("[horse,dog,cat]");
		//String expected=;
		assertEquals(expected.toString(), actual.toString());
		
		
	}

}
