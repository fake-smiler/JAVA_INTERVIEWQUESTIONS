/* import java.util.Scanner;
 public class PrintMultiplication {
 	public static void main(String[]args) {
 		int n,c;
 		System.out.println(" Enter any number for multiplication : ");
 		Scanner myObj = new Scanner(System.in);
 		n = myObj.nextInt();
 		System.out.println(" You Enterd number" + n + " Multiplication :- ");

 		for( c = 1; c <= 10; c++) 
 			System.out.println( n + " * " + c + " = " + (c * n));
 	}
 } 

 // 5 * 1 = 5




 */




/*import java.util.Scanner;
class PrintMultiplication
{
 public static void main(String args[])
 {
 int a, b, c, d;
 
 
 System.out.println("Enter range of numbers to print their multiplication table");
 Scanner in = new Scanner(System.in);
 a = in.nextInt();
 b = in.nextInt();
 for (c = a; c <= b; c++) {
 System.out.println("Multiplication table of "+c);
 for (d = 1; d <= 10; d++) {
 System.out.println(c+"*"+d+" = "+(c*d));
 }
 }
 }
}*/








import java.util.Scanner;
public class PrintMultiplication {
	public static void main(String[]args) {
		int a,b,c,d;
		System.out.println(" Enter range of number to print thier multiplication table :- ");
		Scanner myObj = new Scanner(System.in);
		a = myObj.nextInt();
		b = myObj.nextInt();

		for( c = a; c <= b; c++) {
			System.out.println(" Multiplication of table " + c);

			for( d = 1; d <= 10; d++) {
				System.out.println( c + " * " + d + " = " + (c*d) );
			}
		}
	}
}


// 1 * 1 = 1