import java.util.Scanner;

public class bin2dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Binary no : ");
        int n = in.nextInt();
        System.out.println("Decimel no : " + bin_dec(n));
        in.close();
    }

    public static int bin_dec(int binary) {
        int decimel = 0, power = 0;
        while (binary != 0) {
            int remainder = binary % 10;
            decimel += remainder * (Math.pow(2, power));
            binary = binary / 10;
            power++;
        }
        return decimel;
    }
}
