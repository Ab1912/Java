import java.util.Scanner;

/*
Else If Ladder
90-100 Grade-A
80-89  Grade-B
70-79  Grade-C
<70    Grade-D
*/
public class elseif_statement
{
    public static void main(String[] args) {
        float avg;
        System.out.print("Enter Average Marks : ");
        Scanner in = new Scanner(System.in);
        avg = in.nextFloat();

        if (avg >= 90 && avg <= 100 ) {
            System.out.println("Grade A");
        }
        else if (avg >= 80) {
            System.out.println("Grade B");
        }
        else if (avg >= 70) {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Grade D");
        }
        in.close();
    }
}