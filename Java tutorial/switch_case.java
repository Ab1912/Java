import java.util.Scanner;

public class switch_case{
    public static void main(String[] args) {
        int a,b,c,ch;
        System.out.println("Basic Maths");
        System.out.print("Enter the value of 1st number : ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.print("Enter the value of 2nd number : ");
        b = in.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.print("Enter your choice : ");
        ch = in.nextInt();
        switch (ch) {
            case 1:
                c = a+b;
                System.out.println("Addition : "+c);
                break;
            case 2:
                c = a-b;
                System.out.println("Subtraction : "+c);
                break;
            case 3:
                c = a*b;
                System.out.println("Multiplication : "+c);
                break;
            case 4:
                c = a/b;
                System.out.println("Division : "+c);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        in.close();
    }
}