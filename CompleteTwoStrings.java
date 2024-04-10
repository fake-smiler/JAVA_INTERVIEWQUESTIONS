import java.util.Scanner;
public class CompleteTwoStrings {
	public static void main(String[]args) {
		String s1;
		String s2;
		System.out.println(" Enter First String : ");
		Scanner myObj = new Scanner(System.in);
		s1 = myObj.nextLine();
		System.out.println(" Enter Second String : ");
		s2 = myObj.nextLine();

		if(s1.compareTo(s2) < 0) {
			System.out.println(" String1 is small than String2");
		}
		else if(s1.compareTo(s2) > 0 ) {
			System.out.println(" String1 is big than String2");
		}
		else {
			System.out.println(" String1 and String2 is equal ");
		}
	}
}