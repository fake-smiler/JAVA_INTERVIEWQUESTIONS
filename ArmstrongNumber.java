
/*public class ArmstrongNumber {
	public static void main(String[]args) {
		int no = 153;
		//int no = 371;
		//int no = 111;
		int arm = 0;
		int rem = 0;
		int no2 = no;

		while( no > 0 ) {
			rem = no%10;      // rem = 3  -------> rem = 5      --------------> rem = 1
			arm = arm + (rem*rem*rem);    // arm = 27   ---------> arm = 152    ------------> arm = 153
			no = no/10;    // no = 15  ----------> no = 3       -----------------> no = 1  ---------------> no = 0 condition false so ended loop
		}

		if( no2 == arm ) 
			System.out.println(" This number is armstrong number ");
		else 
			System.out.println(" This is not armstrong number ");
	}
}*/


    import java.util.Scanner;  
    import java.lang.Math;  
    public class ArmstrongNumber  
    {  
    //function to check if the number is Armstrong or not  
    static boolean isArmstrong(int n)   // n value 0 and n value 1
    {   
    int temp, digits=0, last=0, sum=0;   
    //assigning n into a temp variable  
    temp=n;   
    //loop execute until the condition becomes false  
    while(temp>0)  //   
    {   
    temp = temp/10; // 0 
    digits++;   // 1
    }   
    temp = n;   // 0.01
    while(temp>0)   
    {   
    //determines the last digit from the number      
    last = temp % 10;   // 1
    //calculates the power of a number up to digit times and add the resultant to the sum variable  
    sum +=  (Math.pow(last, digits));   // 1
    //removes the last digit   
    temp = temp/10;   // 0
    }  
    //compares the sum with n  
    if(n==sum)   
    //returns if sum and n are equal  
    return true;      
    //returns false if sum and n are not equal  
    else return false;   
    }   
    //driver code  
    public static void main(String args[])     
    {     
    int num;   
    Scanner sc= new Scanner(System.in);  
    System.out.print("Enter the limit: ");  
    //reads the limit from the user  
    num=sc.nextInt();  
    System.out.println("Armstrong Number up to "+ num + " are: ");  
    for(int i=0; i<=num; i++)  
    //function calling  
    if(isArmstrong(i))  
    //prints the armstrong numbers  
    System.out.print(i+ ", ");  
    }   
    }  


     

