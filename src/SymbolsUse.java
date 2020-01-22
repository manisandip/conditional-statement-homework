import java.util.Scanner;

public class SymbolsUse {
    public static void main(String[] args) {
    int a ,b ,res;
        Scanner scanner =new Scanner(System.in);
        System.out.println( " Enter any two numbers :");
        a = scanner.nextInt();
        b = scanner.nextInt();
        res = a + b ;
        System.out.println( " Addition = " +res);
        res = a -b ;
        System.out.println( " Subtraction =" +res);
        res = a * b ;
        System.out.println( " Multiplication =" +res);
        res = a / b ;
        System.out.println( " Division =" +res);
    }

}