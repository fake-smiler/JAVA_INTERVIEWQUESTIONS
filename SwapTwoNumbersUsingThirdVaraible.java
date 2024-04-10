import java.util.Scanner;
public class SwapTwoNumbersUsingThirdVaraible {

	 public static void main(String[]args) {
	 	int x,y,temp;

	 	System.out.println("Enter X and Y ");
	 	Scanner myObj = new Scanner(System.in);
	 	x = myObj.nextInt();
	 	y = myObj.nextInt();

	 	System.out.println("After Swapping\nx = "+x+"\ny = "+y);

	 	temp = x;  //temp = 10   x -  empty
	 	x = y;       // x = 20   y  - empty
	 	y = temp;     // y = 10

	 	System.out.println("After Swapping\nx = "+x+"\ny = "+y);

	 }
}


// x = 10
 // y = 20