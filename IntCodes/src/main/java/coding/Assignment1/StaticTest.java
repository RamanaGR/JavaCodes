package coding.Assignment1;

public class StaticTest {
//	class Test {

	int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		StaticTest t1 = new StaticTest();
		t1.a = 100;
		t1.b = 200;
		StaticTest t2 = new StaticTest();
		System.out.println("t1.a=" + t1.a + "t1.b=" + t1.b);
		System.out.println("t2.a=" + t2.a + "t2.b=" + t2.b);
	}
}
