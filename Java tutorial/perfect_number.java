import java.util.Scanner;

//Program to find perfect number

public class perfect_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n%i==0) {
                sum += i;   
            } 
        }
        if (sum == n) {
            System.out.println(n+" is a Perfect number");
        }
        else {
            System.out.println(n+" is not a Perfect number");
        }
        in.close();
    }
}
