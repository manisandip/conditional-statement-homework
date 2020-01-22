import java.util.Scanner;

public class TypeOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter anything =");
        char ch = scanner.next().charAt(0);
        if ((ch >= 'a'&& ch <='z') || ( ch >= 'A' && ch <= 'Z')){
            System.out.println(ch  +  " is a ALPHABET ");

        }else if ( ch >='0' && ch <= '9'){
            System.out.println( ch +   "  is a NUMBER ");
        }
        else
        {
            System.out.println( ch +" is a SPECIAL CHARACTER ");
    }
}}
