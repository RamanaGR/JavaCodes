package coding.Assignment1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class FirstRcTest {
	
@Test
public void valid() {
assertEquals(FirstRc.nonRc("dude"), 'u');

}
@Test
public void nullStr() {
assertEquals(FirstRc.nonRc(null), 0);

}@Test
public void inValid() {
assertEquals(FirstRc.nonRc("duDu"), 'd');

}@Test
public void sStr() {
assertEquals(FirstRc.nonRc(""), 0);

}@Test
public void singleCharStr() {
assertEquals(FirstRc.nonRc("d"), 'd');

}
@Test
public void capsCharStr() {
assertEquals(FirstRc.nonRc("Access"), 'A');

}



}
