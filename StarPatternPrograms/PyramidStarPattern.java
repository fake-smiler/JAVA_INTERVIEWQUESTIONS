public class PyramidStarPattern {
	public static void main(String[]args) {

		int r = 10;

		for(int i = 0; i < r; i++) {

			for(int j = r-i; j > 1; j--) {
				System.out.print("-");
			}

			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}