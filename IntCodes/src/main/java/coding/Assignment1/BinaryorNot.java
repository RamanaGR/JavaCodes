package coding.Assignment1;

public class BinaryorNot {

	static void Binaryornot(int number) {
		boolean isBinary = true;
		int givenNumber = number;
		while (givenNumber != 0) {
			int temp = givenNumber % 10; // 11.111//12
			if (temp > 1) {
				isBinary = false;
				break;
			} else {
				givenNumber = givenNumber / 10;
			}
		}
		if (isBinary) {
			System.out.println("The number " + number + " is binary");
		} else {
			System.out.println("The number " + number + " is  not binary");
		}
	}

	public static void main(String[] args) {
		Binaryornot(11111);
		Binaryornot(1234);
	}

}
