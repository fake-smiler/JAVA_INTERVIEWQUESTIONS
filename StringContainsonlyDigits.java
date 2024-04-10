public class StringContainsonlyDigits {
	public static void main(String[]args) {
		String str = "123456789";
		boolean result = str.matches("[0-9]+");
		System.out.println("Original String " + str);
		System.out.println("Does String contains only digits? " + result);
	}
}