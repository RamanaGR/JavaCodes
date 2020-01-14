package coding.Assignment1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AnagramTest {
@Test
public void valid() {
	
	boolean actual=Anagram.anag("silent", "listen");

	assertEquals(actual, true);
}
@Test
public void validSpace() {
	
	boolean actual=Anagram.anag("Debit Card", "Bad Credit");

	assertEquals(actual, true);
}
@Test
public void inValid() {
	
	//boolean actual=;

	assertEquals(Anagram.anag("peek", "pack"), false);
}
@Test
public void singleLetter() {
	
	//boolean actual=;

	assertEquals(Anagram.anag("a", "a"), true);
}
@Test
public void validCaps() {
	
	boolean actual=Anagram.anag("ThinG", "Night");

	assertEquals(actual, true);
}

@Test
public void strwithIntegers() {
	
	boolean actual=Anagram.anag("ThinG4b", "b4Night");

	assertEquals(actual, true);
}
@Test
public void strwithSpecialChar() {
	
	boolean actual=Anagram.anag("@ThinG4b", "b4@Night");

	assertEquals(actual, true);
}
}
