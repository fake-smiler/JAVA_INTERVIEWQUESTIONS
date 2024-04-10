import java.util.Scanner;
 public class Split {
 	public static void main(String[]args) {
 		String str = "java is programming language";
 		String[] str1 = str.split("");  // [java -> 0 is -> 1]
 		str = "";
 		String a = " ";
 		String b = " ";
 		int i;

 		for(  i = 0; i <= str1.length; i++)
 			 a = str1[i].substring(0,i).toUpperCase();  // J I P L 
 		     b = str1[i].substring(1);           // ava    s   rogramming    anguage
 		    str = a + b; // Java
 		    str = str + a + " ";  // java is programming language java value


 	Scanner sc = new Scanner(System.in);
 	System.out.println(" Enter any value ");
 	String n = sc.nextLine();
 	str = str + " " + n;
 	System.out.println(str);
 	}
 }