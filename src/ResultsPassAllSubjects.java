import java.util.Scanner;
public class ResultsPassAllSubjects {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.println( "Enter student name  =");
        String name =scanner.next();
        System.out.println( "Enter student roll number =");
        int rollnumber =scanner.nextInt();
        System.out.println( "English marks =");
        int eng =scanner.nextInt();
        System.out.println( "Maths marks =");
        int math=scanner.nextInt();
        System.out.println( "Science marks =");
        int sci =scanner.nextInt();
        System.out.println("Name = " +name);
        System.out.println("Roll number  =" +rollnumber );
        if  (eng<=35||math<=35||sci<=35)
        {
            System.out.println( "Status =" + " fail ");
        }
        else {
            System.out.println( "Status = " + " pass ");
        }

    }}
