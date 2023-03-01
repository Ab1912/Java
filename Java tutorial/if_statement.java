import java.util.Scanner;

public class if_statement
{
    public static void main(String[] args) {
        int age;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        age = inp.nextInt();
        inp.close();

        if (age >= 18)
        {
            System.out.println("You are eligible to vote");   
        }
        else
        {
            System.out.println("You are not eligible to vote");
        }
    }
}