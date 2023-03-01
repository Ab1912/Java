import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        System.out.print("Enter the limit : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = 1;
        while (i <= a) {
            System.out.print(i + "\t");
            i++;
        }
        in.close();
    }
}