public class armstrong_number2 {
    public static void main(String[] args) {
        System.out.println("Program to find Armstrong number between 100 to 999");
        int a,b,c,arm;

        for (int i = 100; i < 1000; i++) {
            a = i%10;
            b = i/10; b = b%10;
            c = i/100;
            arm = (a*a*a) + (b*b*b) + (c*c*c);
            if (i == arm) {
                System.out.println(+i+" is a Armstrong number");
            }
            else
            {
                continue;
            }
        }
    }
}
