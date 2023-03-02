import java.util.Scanner;

public class sum_avg_of_n_numbers {
    public static void main(String[] args) {
        int n,a,sum = 0;
        float avg;
        System.out.print("Enter the limit : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the number : ");
            a = in.nextInt();
            sum = sum+a;
        }
        System.out.println("Sum of numbers : "+sum);
        avg = sum/n;
        System.out.println("Average : "+avg);
        in.close();
    }
}
