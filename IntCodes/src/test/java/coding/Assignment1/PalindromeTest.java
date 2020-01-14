package coding.Assignment1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class PalindromeTest {

	@Test
	public void nullString() {
		String s=null;
		boolean b=Palindrome.palin(s);
		assertEquals(b, false);
	}
	@Test
	public void emptyString() {
		String s="";
		boolean b=Palindrome.palin(s);
		assertEquals(b, false);
	}
	@Test
	public void spString() {
		String s="@ #$# @";
		boolean b=Palindrome.palin(s);
		assertEquals(b, true);
	}
	@Test
	public void capstring() {
		String s="eEieE";
		boolean b=Palindrome.palin(s);
		assertEquals(b, false);
	}
	
}
