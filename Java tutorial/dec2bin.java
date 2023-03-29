import java.util.Scanner;

public class dec2bin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the decimal no : ");
        int n = in.nextInt();
        System.out.print("Binary no : ");
        deci2bin(n);
        in.close();
    }

    public static void deci2bin(int n) {
        int[] binum = new int[1000];
        int i = 0;
        while (n>0) {
            binum[i] = n%2;
            n = n/2;
            i++;
            
        }
        for (int j = i-1; j >= 0; j--) {
            System.out.print(binum[j]);
        }
    }
}
