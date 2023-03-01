import java.util.Scanner;

/*
    Nested if Statement
    A company insures its drivers in the following cases:
        a.	If the driver is married.
        b.	If the driver is unmarried, male & above 30 years of age.
        c.	If the driver is unmarried, female & above 25 years of age.
        */
/**
 * nestedif_statement
 */
public class nestedif_statement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Marital status M/U : ");
        char marital = in.next().charAt(0);
        if (marital == 'U' || marital == 'u') {
            System.out.print("Enter the Gender M/F : ");
            char gender = in.next().charAt(0);
            System.out.print("Enter the age : ");
            int age = in.nextInt();
            if ((gender == 'm' || gender == 'M') && age >= 30) {
                System.out.println("Marital status : Unmarried, Age : " + age + ", eligible for insurance");
            } else if ((gender == 'f' || gender == 'F') && age >= 25) {
                {
                    System.out.println("Marital status : Unmarried, Age : " + age + ", eligible for insurance");
                }
            } else {
                System.out.println("You are not eligible for insurance");
            }
        } else if (marital == 'M' || marital == 'm') {
            System.out.println("Married, you are eligible for insurance");
        } else {
            System.out.println("Invalid output");
        }
        in.close();
    }
}