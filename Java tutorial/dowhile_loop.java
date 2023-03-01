import java.util.Scanner;

public class dowhile_loop {
    public static void main(String[] args) {
        int i = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int a = in.nextInt();
        do {
            System.out.print(i +"\t");
            i++;
        } while (i <= a);
        in.close();
    }
}