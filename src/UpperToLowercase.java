import java.util.Scanner;

public class UpperToLowercase {
    public static void main(String[] args) {
        String strUpper,StrLower;
        Scanner scan = new Scanner(System.in);
        System.out.println( " Enter a word /sentence  in uppercase :");
        strUpper = scan.nextLine();
        StrLower =strUpper.toLowerCase();
        System.out.println( "word /sentence  in lowercase  = " + StrLower );

    }
}
