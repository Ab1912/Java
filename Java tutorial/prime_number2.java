

// Prime numbers from 1 to 999
public class prime_number2 {
    public static void main(String[] args) {
        int f = 0;
        System.out.println("Prime numbers : ");
        for(int n=1;n<=99;n++) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    f++;
                }
            }
            if (f == 2) {
                System.out.println(n);
            }
            f=0;
        }
 
    }
}

