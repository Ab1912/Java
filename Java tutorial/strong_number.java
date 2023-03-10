import java.util.Scanner;

/*Program to find Strong number
145 = 
str = 1+(1*2*3*4)+(1*2*3*4*5) 
str == 145*/
public class strong_number {
    public static void main(String[] args) {

        int num,tnum,a,b,sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = in.nextInt();
        tnum = num;
        while (tnum>0) {
            a = tnum%10;
            b = 1;
            for (int i = 1; i <= a; i++) {
                b *=i;
            }
            sum += b;
            tnum /=10;
        }
        if (num == sum) {
            System.out.println(num+" is a Strong number");
        }
        else {
            System.out.println(num+" is not a Strong number");
        }
        in.close();
    }
}
