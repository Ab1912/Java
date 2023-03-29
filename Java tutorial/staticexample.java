import java.util.Scanner;

public class staticexample {
    public static void main(String[] args) {
        int b,p;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base value : ");
        b = in.nextInt();
        System.out.print("Enter power value : ");
        p = in.nextInt();
        int tot = mathematics.power(b, p);
        System.out.println("Answer : "+tot);
        in.close();
    }
}

class mathematics {
    public static int power(int base, int power) {
        int result=1;
        for(int i=0; i< power; i++) {
            result *= base;
        }
        return result;
    }
}
