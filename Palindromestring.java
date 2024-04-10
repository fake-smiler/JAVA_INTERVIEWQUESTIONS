/*public class Palindromestring {
	public static void main(String[]args) {
		String str = "Radar";
		String reverseString = "";
	    int len = str.length();

	    for(int i = (len - 1); i >= 0; --i) {
	    	reverseString = reverseString + str.charAt(i); // then i collected string value through index for this i used charat method
	    }                                                  // currently i value is 4 so index value start the 0 so r is stored reversestring

	    if(str.toLowerCase().equals(reverseString.toLowerCase())) {   // as a string not an character because i put the reverstring
	    	System.out.println(str + " is a palindrome");
	    }

	    else {
	    	System.out.println(str + " is a not palindrome");
	    }
	}
}                                                                    // the tolowercase metod convert both str and reversestring to lowercase
                                                                 // this is because java is a case sensitve and capital R and small r
                                                                 // are two different values
                                                                 // the equals method checks if two strings are equal.*/





public class Palindromestring {
	public static void main(String[]args) {
		//int no = 525;
		int no = 567;
		int r;
		int sum = 0;
		int temp = no;

		while(no > 0) {
			r = no%10;
			sum = (sum * 10) + r;
			no = no/10;
		}

		if(temp == sum )
			System.out.println(" This is palindrome ");
		else 
			System.out.println(" This is not palindrome");
	}
}