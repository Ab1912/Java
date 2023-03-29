import java.util.Scanner;

class small {
    private int m,n;
    small(int x, int y) {
        this.m = x;
        this.n = y;
    }
    int smallest() {
        if (m < n) {
            return m;
        }
        else {
            return n;
        }
    }
    void display() {
        int small = smallest();
        System.out.println("Smallest number is : "+small);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  values : ");
        int a = in.nextInt();
        int b = in.nextInt();
        small obj = new small(a,b);
        obj.display();
        in.close();
    }
}