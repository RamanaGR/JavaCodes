package coding.Assignment1;

public class PhoneNumber {
	public static boolean validateUSPhoneNumber(String input) {

		if(input == null || input.length() < 10) {
			return false;
		}
		
		if(input.matches("\\d{10}")) return true;
		
		if(input.matches("\\d{3} - \\d{3} - \\d{4}")) return true;

		if(input.matches("(\\d{3}) \\d{3} - \\d{4}")) return true;

		return false;
	}
	public static void main(String[] args) {
		String input="9505014847";
		System.out.println(validateUSPhoneNumber(input));
	}
}
