import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Multiplication table : ");
        int t = in.nextInt();
        System.out.print("Enter the limit : ");
        int l = in.nextInt();
        int t1;
        System.out.println("\nMultiplication table of "+t+"\n");
        for (int i = 1; i <= l; i++) {
             t1 = t * i;    
             System.out.println(+t+" X "+i+" = "+t1);        
        }
        in.close();
    }
}
