public class LeftTriangleStarPattern {
	public static void main(String[]args) {

		int r = 5;

		for( int i = 0; i < r; i++) {

			for( int j = 2*(r - i); j >= 0; j--) {

				System.out.print("-");
			}

			for( int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}