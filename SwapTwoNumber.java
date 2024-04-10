import java.util.Scanner;
class SwapTwoNumber {
	public static void main(String[]args) {
		int x,y;
        System.out.println(" Enter X and y ");         
		Scanner myObj = new Scanner(System.in);
		 x = myObj.nextInt();
		 y = myObj.nextInt();

		 System.out.println("Before Swapping\nx : " + x + "\ny : " + y);

		 x = x + y;  // 10 + 20 = 30
		 y = x - y;  // 30 - 20 = 10
		 x = x - y;   // 30 - 10 = 20

		 System.out.println("After Swapping\nx : " + x +  "\ny : " + y);
	}
}