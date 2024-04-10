/*public class BinaryorNot {
	public static void main(String[]args) {
		System.out.printf("Does number %d is this binary ? %b %n" ,101, isBinary(101));
	}

		public static boolean isBinary(int num) {
			int check = num;

			while(check != 0) {
				if(check % 10 > 1) {
					return false;
				}
				check = check/10;
			}
			return true;
		}
}*/


/*import java.util.*;
public class BinaryorNot {
	public static void main(String[]args) {
		int arr[] = {1,2,3,1,4,5,5};
		int n = arr.length;

		HashSet<Integer> hash_set = new HashSet<Integer>();

		for( int i = 0; i < n; i++) 
			hash_set.add(arr[i]);
		

		System.out.print(hash_set);
	}
}*/


/*public class BinaryorNot {
	public static void main(String[]args) {
		String str = "aabcdd";
		//int len = str.length();

		System.out.println("Original string : " + str);
		System.out.println("After Remove string : " + RemoveLetters(str));
	}

	public static String RemoveLetters(String n) {
		String ans = "";

		for( int i = 0; i < n.length(); i++) {

			int j;

			for( j = 0; j < i; j++) {

				if( n.charAt(i) == n.charAt(j)) {
					break;
				}
				}

				if( i == j) {
				ans += n.charAt(i);
			
			}
		}
		return ans;
}

	}*/

    /*import java.util.Scanner;
	public class BinaryorNot {
		public static void main(String[]args) {
			int num,originalnum,rem,fact,i,sum = 0;
			System.out.println("Enter any number : ");
			Scanner myobj = new Scanner(System.in);
			num = myobj.nextInt();
			originalnum = num;

			while(num > 0) {
				rem = num%10;      // 5           
				fact = 1;

				for(i = 1; i <= rem; i++) {
					fact = fact*i;             // 1*1 = 1, 1*2 = 2, 2*3 = 6, 6
				}
				sum = sum + fact;
				num = num/10;
			}

			if(sum == originalnum) {
				System.out.println(originalnum + " Is a Strong number");
			}
			else {
				System.out.println(originalnum + " Is a not Strong number");
			}
		}
	}*/

     import java.util.Arrays;
	public class BinaryorNot {
		public static void main(String[]args) {
			String str = "Iama Ram";
			String[] str2 = str.split(" ");
			//String res = str2.substring(2,5);
			//String str2 = res.trim();
			//String str3 = str.toLowerCase();
			//String str4 = str.toUpperCase();        7200570486   9843910070

			for(String res : str2 ) {
			System.out.println(Arrays.toString(res) + ", ");
		}
		}
	}