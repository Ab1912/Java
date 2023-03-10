import java.util.Scanner;

public class array_ex1 {
    public static void main(String[] args) {
        
        int e=0,o=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the count : ");
        int cou = in.nextInt();
        int []num = new int[cou];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter the number : ");
            num[i] = in.nextInt();
        }
        System.out.println("\nValues are : ");
        for (int i : num) {
            System.out.print(i+"\t");
        }
        for (int i : num) {
            if (i%2==0) { 
                e++;
            }
            else {
                o++;
            }  
        }
        System.out.println("\nCount of Even numbers : "+e);
        System.out.println("Count of Odd numbers : "+o);
        in.close();
    }
}
