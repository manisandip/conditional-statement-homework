import java.time.temporal.Temporal;
import java.util.Scanner;

public class InterChangeValue {
    public static void main(String[] args)
    {
        int a ;
        int b ;

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter the value of a ");
        a=scanner.nextInt();
        System.out.println( "Enter the value of b ");
        b=scanner.nextInt();
        System.out.println( " Before swapping  : a,b  = "+a+" ," + +b);
        a = a + b;
        a = a - b;
        b = a - b;
        System.out.println(  " After swapping  : a ,b  = "+a+","+ +b );
    }
}
