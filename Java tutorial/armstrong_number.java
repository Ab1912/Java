import java.util.Scanner;

//Program to find Armstrong a number
public class armstrong_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a 3 number : ");
        int num = in.nextInt();
        int a,b,c,arm;
        
            a = num%10;
            b = num/10; b = b%10;
            c = num/100;
            arm = (a*a*a) + (b*b*b) + (c*c*c);
            if (num==arm) {
                System.out.println(+num+" is a Armstrong number");
            } 
            else if (num <=99 || num >=1000 ) {
                System.out.println("Invalid input");
            }
            else {
                System.out.println(+num+" is not a Armstrong number");
            }

        in.close();
    }
}
