/*
You are given an integer nn, you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts nn into a string ss the code will print "Good job". Otherwise it will print "Wrong answer".

nn can range between −100−100 to 100100 inclusive.
*/

import java.util.*;
import java.security.*;
public class IntToString {
	public static void main(String[] args) {
		
		Do_Not_Terminate.forbidExit();

		try{
			Scanner in = new Scanner(System.in);
			int n=in.nextInt();
      String s = Integer.toString(n);
      if(n==Integer.parseInt(s))
			{
				System.out.println("Good job");
			}
			else
			{
				System.out.println("Wrong answer.");
			}
		}
		catch (Exception e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}
 