import java.util.Scanner;

public class ifelse_statement
{
    public static void main(String[] args) {
        int year;
        System.out.print("Enter the year : ");
        Scanner in = new Scanner (System.in);
        year = in.nextInt();

        if(year%4==0 || (year%100==0 && year%400==0))
        {
            System.out.println("Year "+year+" is a leap year");
        }
        else
        {
            System.out.println("Year "+year+" is a not leap year");
        }
        in.close();
    }
}