import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num ;
        System.out.println( "Enter any integer Number: ");
        num =scanner.nextInt();
        if (num>0) {
            System.out.println(" It is a Positive  number ");
        }
        else if (num<0){
            System.out.println( "It is a Negative number ");
        }else {
            System.out.println(" It is zero ");
        }
}}
