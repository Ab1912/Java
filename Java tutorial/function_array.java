import java.util.Scanner;
import java.util.Arrays;

public class function_array {
    public static void main(String[] args) {
        int arr[] = sendarray();
        for (int i : arr) {
            System.out.print(i+"\t");
        }
        int arr1[] = sortarray();
        for (int i : arr1) {
            System.out.print(i+"\t");
        }

    }

    public static int[] sortarray() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i=0; i < n; i++) {
            System.out.print("Enter the value : ");
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        in.close();
        return a;
    }

    public static int[] sendarray() {

        return new int[] {1,2,3,4};
    }
}