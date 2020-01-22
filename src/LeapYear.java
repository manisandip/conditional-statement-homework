import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( " Enter any year ");
        int year =scanner.nextInt();
        if (year%4 == 0 )
        {
            System.out.println("YEAR "+ year+ "  is a leap year ");
    }
        else
        {
            System.out.println("YEAR "+ year+  " is not a leap year  ");
        }
}}
