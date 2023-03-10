
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[]={10,20,30,40,50,60,70,80,90,100};
        //Array output
        // Method 1
        System.out.println(a[3]+"\n");

        // FOR loop 
        //Method 1
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println("\n");

        //Method 3
        for (int i : a) {
            System.out.print(i+"\t");
        }

        //Creating a variable array & allocationg memory
        int [] b = new int[10]; 
        for (int i : b) {
            System.out.println(i);
        }

        // Getting array input
        System.out.print("Enter the Array size : ");
        int j = in.nextInt();
        int []d = new int[j];
        for (int i = 0; i < d.length; i++) {
            System.out.print("Enter the number : ");
            d[i] = in.nextInt();
        }

        for (int i : d) {
            System.out.println(i);
        }
        in.close();
    }
}
