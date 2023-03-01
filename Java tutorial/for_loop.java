import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int a = in.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.print(i + "\t");
        }
        in.close();
    }
}