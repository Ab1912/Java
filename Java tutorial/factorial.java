import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f=f*i;
        }
        System.out.println("Factorial of "+n+" is : "+f);
        in.close();
    }
}
