import java.util.Scanner;

class Main
{
    public static void main(String[] args) 
    {
        int e=0,o=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Count : ");
        int cou = in.nextInt();  
        int []num = new int[cou];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter the number : ");
            num[i] = in.nextInt();
        }
        for (int i : num) {
            if (i%2 == 0 ) {
                e++;
            }
            else {
                o++;
            }
        }
        System.out.println("Count of Even numbers : "+e);
        System.out.println("Count of Odd numbers : "+o);
    in.close();
    }
}