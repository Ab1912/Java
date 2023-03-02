import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n,a=-1,b=1,c;
        System.out.print("Enter the number : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            //f1 = f1 + i;
            c = a+b;
            System.out.print(c+"\t");
            a=b;
            b=c;
        }
        in.close();
    }
}
