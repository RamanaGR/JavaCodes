package coding.Assignment1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ShuffleHpTest {
	@Test
	public void validString() {
		String str1="WX";
		String str2="YZ";
		String str="ZYWX";
		boolean actual = ShuffleHp.shuffle(str, str1, str2);
		assertEquals(actual, true);
	}
	
	@Test
	public void inValidString() {
		String str1="PQR";
		String str2="MNO";
		String str="NMLOPQR";
		boolean actual = ShuffleHp.shuffle(str, str1, str2);
		assertEquals(actual, false);
	}
	@Test
	public void intString() {
		String str1="123";
		String str2="45";
		String str="12345";
		boolean actual = ShuffleHp.shuffle(str, str1, str2);
		assertEquals(actual, true);
	}
	@Test
	public void negIntString() {
		String str1="-1-2-3";
		String str2="-4-5";
		String str="-1-3-2-4-5";
		boolean actual = ShuffleHp.shuffle(str, str1, str2);
		assertEquals(actual, true);
	}
	@Test
	public void emptyString() {
		String str1=" ";
		String str2=" ";
		String str="  ";
		boolean actual = ShuffleHp.shuffle(str, str1, str2);
		assertEquals(actual, true);
	}
	@Test
	public void nullString() {
		String str1=null;
		String str2=null;
		String str=null;
		boolean actual = ShuffleHp.shuffle(str, str1, str2);
		assertEquals(actual, false);
	}

}
