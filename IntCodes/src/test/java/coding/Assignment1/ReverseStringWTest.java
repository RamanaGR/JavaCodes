package coding.Assignment1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ReverseStringWTest{
	@Test
	public void validString() {
		
		assertEquals(ReverseStringW.reverseWord("hello how are you"), "olleh woh era uoy ");
	}
	@Test
	public void inValidString() {
		
		assertEquals(ReverseStringW.reverseWord("hellohowareyou"), "uoyerawoholleh ");
	}
	@Test
	public void nullString() {
		
		assertEquals(ReverseStringW.reverseWord(null), null);
	}
}
