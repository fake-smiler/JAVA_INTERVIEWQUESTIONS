/*public class ReverseString {
	public static void main(String[]args) {
		String str = "ramachandran";  // 12

		for( int i = str.length()-1; i >= 0; i--) {

			System.out.print(str.charAt(i));
		}
	}              
}*/

// Using user input through reverse string

import java.util.Scanner;
public class ReverseString {
	public static void main(String[]args) {
		System.out.println(" Enter any character : ");
		Scanner myObj = new Scanner(System.in);
		 String str = myObj.nextLine();
		 String length = str;

		 for( int i = length.length()-1; i >= 0; i--) {
		 	System.out.print(length.charAt(i));
		 }
	}
}



