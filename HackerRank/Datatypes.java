import java.util.Scanner;
class Datatypes{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in: ");
                if(x>=-128 && x<=127) {System.out.println("* byte");}
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){System.out.println("* short");}
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){System.out.println("* int");}
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){System.out.println("* long");}
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
/*import java.util.Scanner;
public class Datatypes {
    public static void main(String[]args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        for(int i = 0; i < t; i++) {

            try {

            long l = obj.nextLong();

            if(l >= -128 && l <= 127)
                System.out.println("* byte ");

            if(l >= Short.MIN_VALUE && l <= Short.MAX_VALUE) 
                System.out.println("* short ");

            if(l >= Integer.MIN_VALUE && l <= Integer.MAX_VALUE)
                System.out.println("* int ");

            if(l >= Long.MIN_VALUE && l <= Long.MAX_VALUE)
                System.out.println("* long ");
        }
    

    catch(Exception e) {
        System.out.println(obj.next() + " Can't be fitted");

    }
}
    }
}*/