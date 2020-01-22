import java.util.Scanner;

public class SalesCommision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter sales id :");
        int id = scanner.nextInt();
        System.out.println( "Enter seller's  name :");
        String name = scanner.next();
        System.out.println( "Enter sales amount :");
        int salesamount =scanner.nextInt();
        System.out.println( "Enter basic salary :");
        int salary =scanner.nextInt();
        if (salesamount>=50000)
        {
            System.out.println( " Sales Commission (35%) =" +salesamount*35/100);}
        else if (salesamount>=30000)
{
    System.out.println( " Sales Commission (20%) =" + salesamount*20/100 );}
        else if (salesamount>=10000)
    {
        System.out.println( " Sales Commission (10%) =" +salesamount*10/100);}
        else
        {
            System.out.println( "Sales commission (2%) =" +salesamount*2/100);
    }
}}
