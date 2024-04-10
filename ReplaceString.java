public class ReplaceString {
	public static void main(String[]args) {
		String str1 = " My name is Ramachandran My name is Ramachandran ";
		String str2 = str1.replaceAll(" Ramachandran " , " Krishna ");
		System.out.println(str2);
	}
}



/*public class ReplaceString{ 
public static void main(String args[]){ 
String s1="My name is Rajendra. My name is lamror. My name is Technolamror."; 
String replaceString=s1.replaceAll("is","was");//replaces all occurrences of "is" to 
//"was" 
System.out.println(replaceString); 
}}*/
