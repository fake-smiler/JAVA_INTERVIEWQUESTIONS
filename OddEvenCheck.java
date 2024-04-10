import java.util.Scanner;
public class OddEvenCheck {
	public static void main(String[]args) {
		int num;
		System.out.println(" Enter Any Number : ");
		Scanner myObj = new Scanner(System.in);
		num = myObj.nextInt();

		if( num % 2 == 0 ) {
			System.out.println(" Your Entered Even number " + num);
		}
		else {
			System.out.println(" Your Entered Odd number " + num);
		}
	}
}