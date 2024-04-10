/*import java.util.Scanner;

public class FormatSpecifier {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-14s %0d\n", s1, x);
            }
            System.out.println("================================");

    }
}*/

import java.util.Scanner;
class FormatSpecifier{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);                // Ramea onnu mattum nalla therjikoo avanga lonelya feel panna solla mattum than 
        int t=in.nextInt();                                 // unkita peasuvanga.. avangaluu vera yarachum vandhutanga na unna kandukakudamata
        for(int i=0;i<t;i++){                               // unna oru Aalavea madhika mata.... so idhu veandam... vitudu...
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int calc = a;
            for(int j=0;j<n;j++)
            {
                calc+=(Math.pow(2,j)*b);
                System.out.print(calc+" ");
            }
            System.out.println();
        }
        in.close();
    }
}