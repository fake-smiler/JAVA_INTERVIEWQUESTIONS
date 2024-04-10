// Using user input through find prime number..

/*import java.util.Scanner;                                                                            
public class PrimeNumber {
	public static void main(String[]args) {
		System.out.println(" Enter any number : ");
		Scanner myObj = new Scanner(System.in);
		int s = myObj.nextInt();
		boolean status = true;                                                                         

		for( int n = 2; n <= s/2; n++ ) {

			if( s % n == 0 ) {
				status = false;
				break;
			}
		}

		if(status == false )
			System.out.println(" Your number is a " + s + " not prime number");
		else 
			System.out.println(" Youre number is a " + s + " prime number");
	}
}*/


// Using default number through find prime number..


/*public class PrimeNumber {
	public static void main(String[]args) {
		//int n = 7;
		int n = 3;
		boolean status = true;

		for( int i = 2; i <= n/2; i++) {

			if( n % i == 0) {
				status = false;
				break;
			}
 		}

 		if(status == false)
 			System.out.println(" your number is a " + n + " not prime number");
 			else 
 			System.out.println(" your number is a " + n + " prime number"); 
	}
}
*/
// Using specific range through find prime numbers

public class PrimeNumber {
	public static void main(String[]args) {
		int n;
		int i;
		String PrimeNumber = " ";

		for( i = 1; i <= 100; i++) {
			int count = 0;

			for( n = i; n >= 1; n--) {
				
				if( i % n == 0) {
					count = count + 1;
				} 
			}

		if( count == 2) {
			PrimeNumber = PrimeNumber + i + " ";
		}
	}

		System.out.println( " Print numbers " + i + " ");
		System.out.println(PrimeNumber);
	}
}


    