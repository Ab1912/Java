import java.util.Scanner;

// Program to check input number is a prime number
public class prime_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        int c = 0;
        for (int i = 1; i <= num; i++) {
            if (num%i == 0) {
                c++;
            }
            else {
                continue;
            }
        }
        if (c == 2) {
            System.out.println(num+" is a Prime number");
        }
        else {
            System.out.println(num+" is not a Prime number");
        }
        in.close();
    }
}
