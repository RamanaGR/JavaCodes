package coding.Assignment1;

import static org.testng.Assert.*;
//import static org.testng.Assert.assertNull;

import org.testng.annotations.Test;
import coding.Assignment1.Duplicates;

public class DuplicatesTest {
  @Test
  public void testNormalDuplicates() {
  	
  	assertEquals(Duplicates.getDuplicates("AABBCC"), "ABC");
  }

  @Test
  public void testNoDuplicates() {
  	
  	assertEquals(Duplicates.getDuplicates("ABC"),"");
  }

  @Test
  public void testFirstDuplicates() {
  	
  	assertEquals(Duplicates.getDuplicates("AABC"), "A");
  }

  @Test
  public void testLastDuplicates() {
	  String act=Duplicates.getDuplicates("ABCC");
	  String exp="C";  	
  	assertEquals(act, exp);
  }

  @Test
  public void testNullString() {
  	
  	assertNull(Duplicates.getDuplicates(null));
  }

  @Test
  public void testEmptyString() {
	  String actual=Duplicates.getDuplicates("");
  	
  	assertNull(actual);
  }

  @Test
  public void testSingleCharString() {
  	
  	assertEquals(Duplicates.getDuplicates("A"),"");
  }

  @Test
  public void testCaseSensitiveString() {
  	
  	assertEquals(Duplicates.getDuplicates("AabbCc"), "b");
  }




  }

