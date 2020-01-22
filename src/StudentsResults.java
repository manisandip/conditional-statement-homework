import java.util.Scanner;

public class StudentsResults {
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
        System.out.print( "Total marks of subjects = ");
        System.out.println(eng+math+sci);
        System.out.println( "percentage of subjects is = "+(eng+math+sci)*100/300 +"%");
            if  ((eng<35) || (math<35) ||(sci<35))
            {
                System.out.println("fail");
            }
        else {
                System.out.println("pass");
            }
        if (eng+math+sci*100/300 >=80 ) {
            System.out.println("Grade = " + "A+");
        }else if (eng+math+sci*100/300 >=60)
        {
            System.out.println( " Grade = "+"A");}
        else if (eng+math+sci*100/300 >=50) {
            System.out.println(" Grade  =" + "B");
        }else if (eng+math+sci*100/300 >=35)
        {
            System.out.println( " Grade  =" +"C");


        }

        }

    }


