import java.io.*;
import java.util.*;

public class EndOfFile {

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int i=1;
        while (sc.hasNext()) {
        	String s=sc.nextLine();
        	System.out.println(i + " " + s);
        	i++;
        }
    }
}

/*import java.util.Scanner;
public class EndOfFile {
    public static void main(String[]args) {

        Scanner obj = new Scanner(System.in);

        int i = 1;

        while(obj.hasNext()) {
            String s = obj.nextLine();
            System.out.println(i + " " + s);
        }
    }
}*/