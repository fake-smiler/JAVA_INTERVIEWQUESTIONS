import java.util.Scanner;
public class FactorialNum {
	public static void main(String[]args) {
		int fact = 1;
		int num;
		int i;
		System.out.println(" Enter Any Number : ");
		Scanner myObj = new Scanner(System.in);         // then i created scanner object because i get the user value..
		num = myObj.nextInt();                          // then i get the user value strored the num variable using nextInt()

		if( num < 0 ) {
			System.out.println( " This number is not factorial number");
		}                                                                   // then i created condition if condition my condition is 0 
                                                                            // lessthan num value. if the condition is true this statement
		else {                                                              // is printed if the condition is false come in else 
			for( i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.print( num + " Factorial number is : " + fact);
		}
		
	}
}