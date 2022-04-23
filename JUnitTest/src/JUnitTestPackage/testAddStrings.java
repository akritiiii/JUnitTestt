package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitFunctions jUnitString=new JUnitFunctions();
		String result=jUnitString.addStrings("capstone","project");
		assertEquals("capstoneproject",result);
	}

}
