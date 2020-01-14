package coding.Assignment1;


import org.testng.Assert;
import org.testng.annotations.Test;


public class IntersectionATest {
	@Test
	public void positive() {
		int a[]= {4,9,5};
		int b[]= {9,4,9,8,4};
		int[] ex= {4, 9};
		int[] act=IntersectionA.intersection(a,b);
		Assert.assertEquals(act, ex);
	}
	@Test
	public void negative() {
		int a[]= {-1,-2,2,-1,2};
		int b[]= {1,-2};
		int[] ex= {-2};
		int[] act=IntersectionA.intersection(a,b);
		Assert.assertEquals(act, ex);
	}
	@Test
	public void nullArr() {
		int a[]= {1,2,2,1,2};
		int b[]= null;
		int[] act=IntersectionA.intersection(a,b);
		Assert.assertEquals(act, null);
	}
	@Test
	public void zero() {
		int a[]= {0};
		int b[]= {0};
		int[] act=IntersectionA.intersection(a,b);
		Assert.assertEquals(act, "[0]");
	}
	@Test
	public void empty() {
		int a[]= {};
		int b[]= {};
		int[] act=IntersectionA.intersection(a,b);
		Assert.assertEquals(act, null);
	}
	@Test
	public void combiPosNegz() {
		int a[]= {2,-6,5,-4,6,2,0,3};
		int b[]= {0,1,2,5,-6,-5,6};
		int[] act=IntersectionA.intersection(a,b);
		Assert.assertEquals(act, "[0, 2, 5, -6, 6]");
	}
	@Test
	public void zerko() {
		int a[]= {0,0,0,0};
		int b[]= {0,0};
		int[] act=IntersectionA.intersection(a,b);
		Assert.assertEquals(act, "[0]");
	}
}
