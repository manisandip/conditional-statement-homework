import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.println( " Enter the alphabet  =");
        Scanner scanner=new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if (ch =='a'|| ch =='e' || ch =='i' || ch =='o' || ch =='u'){
        System.out.println( " Given character is a vowel ");
    }
        else{
            System.out.println( " Given character is a consonant ");
}}}
