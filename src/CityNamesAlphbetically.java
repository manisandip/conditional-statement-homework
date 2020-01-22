import java.util.Scanner;

public class CityNamesAlphbetically {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter an alphabet  :");
        char city = scanner.next().charAt(0);
        switch ( city  )
        { case 'A' :
            System.out.println( " City from A is : Angola " );
            break;
            case 'B' :
                System.out.println(" City from B is : baroda " );
            break;
            case 'C' :
                System.out.println(" City from C is : chennai " );
            break;
            case 'D':
                System.out.println( " City from D is :Delhi " );
            break;
            case 'E':
                System.out.println(" City from E is : England " );
            break;
            case 'F' :
                System.out.println(" City from F is : France  ");
            break;
            default:
                System.out.println( " Invalid city ");

    }



    }}

