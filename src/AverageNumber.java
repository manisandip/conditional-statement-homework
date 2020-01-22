import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        int score1;
        int score2;
        int score3;
        int score4;
        int score5;
        Scanner scanner = new Scanner( System.in);
        System.out.println( "Enter the score1 ");
        score1 = scanner.nextInt();
        System.out.println( "Enter the score2 ");
        score2 =scanner.nextInt();
        System.out.println("Enter the score3 ");
        score3 =scanner.nextInt();
        System.out.println("Enter the score4 ");
        score4 =scanner.nextInt();
        System.out.println("Enter the score5 ");
        score5 =scanner.nextInt();
        System.out.println(" Average of the scores is = "+(score1+score2+score3+score4+score5)/5);
    }
}
