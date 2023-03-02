import java.util.Scanner;

public class reverse_digit {
    public static void main(String[] args) {
        
        int n, reverse = 0, rem;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to reverse : ");
        n = in.nextInt();
        while (n!=0) {
            rem = n%10;
            reverse = (reverse*10)+rem;
            n/=10;
        }
        System.out.println("Reverse number is : "+reverse);
        in.close();
    }
}
