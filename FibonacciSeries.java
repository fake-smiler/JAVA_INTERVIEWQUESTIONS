public class FibonacciSeries {
	public static void main(String[]args) {
		int n1 = 0 , n2 = 1 , n3 , i , count = 10;
		System.out.print( n1 + " " + n2); // Printing 0 and 1

		for( i = 2; i < count; ++i) {

			n3 = n1+n2; //  1 2 3 5 8 13 21 34

			System.out.print(" " + n3); // 1 2 3 5 13 21 34 

			n1 = n2;  // 1 1 2 3 5 8 13 21

			n2 = n3;  // 1 2 3 5 8 13 21 34
		}
	}
}



// 0 1   1 2 3                             0 1 1 2 3 5 8 13 21 34