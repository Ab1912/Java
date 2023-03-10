import java.util.Arrays;
//import java.util.Scanner;

// insert a number in an array
public class array2 {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        int a[] = {10,20,30,40,50,60,70,80,90,100,110};
        int index = 2;
        int value = 55;
        System.out.println("Before inserting value : "+Arrays.toString(a));

        for (int i=a.length-1; i > index; i--) {
            a[i] = a[i-1];
        }
        a[index] = value;
        System.out.println("After inserting value : "+Arrays.toString(a));
    }
}
