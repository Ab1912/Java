import java.util.Arrays;
import java.util.Scanner;

public class function_array {

    public static int[] sortArray() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the limit : ");
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the value "+ i +  ": ");
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            return a;
        }
        

    }
    public static void main(String[] args) {
        int arr[] = sortArray();
        for (int i : arr) {
            System.out.println(i);
        }
    }

}